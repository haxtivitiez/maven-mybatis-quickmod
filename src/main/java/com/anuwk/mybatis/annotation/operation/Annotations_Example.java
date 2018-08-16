package com.anuwk.mybatis.annotation.operation;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.anuwk.mybatis.annotation.mapper.Student_mapper;
import com.anuwk.mybatis.annotation.model.StudentForAnnotaion;

public class Annotations_Example { 

   public static void main(String args[]) throws IOException{
      
      Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
      SqlSession session = sqlSessionFactory.openSession();
      session.getConfiguration().addMapper(Student_mapper.class);
      
      Student_mapper mapper = session.getMapper(Student_mapper.class);      
      
      //Create a new student object
      StudentForAnnotaion student = new StudentForAnnotaion();
      
      //Set the values      
      student.setName("zara");
      student.setBranch("EEE");
      student.setEmail("zara@gmail.com");
      student.setPercentage(90);
      student.setPhone(123412341);
            
      //Insert student data   
      mapper.insert(student);
      System.out.println("record inserted successfully");
      session.commit();
     
      
    //Get the student details
      StudentForAnnotaion student2 = mapper.getById(5);
      System.out.println(student2.getBranch());
      System.out.println(student2.getEmail());
      System.out.println(student2.getId());
      System.out.println(student2.getName());
      System.out.println(student2.getPercentage());
      System.out.println(student2.getPhone());      
      session.commit();


      mapper.delete(3);
      System.out.println("record deleted successfully");
      session.commit();


    //select a particular student using id		
      StudentForAnnotaion student3 = mapper.getById(7);
      System.out.println("Current details of the student are "+student3.toString());  
         
      //Set new values to the mail and phone number of the student
      student3.setEmail("Shyam123@yahoo.com");
      student3.setPhone(984802233);
         
      //Update the student record
      mapper.update(student3);
      System.out.println("Record updated successfully");   
      session.commit();   
      session.close();


			
   }
   
}
