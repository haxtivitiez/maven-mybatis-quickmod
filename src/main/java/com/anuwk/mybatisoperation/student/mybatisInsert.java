package com.anuwk.mybatisoperation.student;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.anuwk.model.Student;

public class mybatisInsert { 

   public static void main(String args[]) throws IOException{
      
      Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
      SqlSession session = sqlSessionFactory.openSession();
      
      //Create a new student object
     Student student = new Student(); 
     student.setName("Anuwat");
     student.setBranch("Programmer");
     student.setPercentage(60);
     student.setPhone(1166542);
     student.setEmail("kk@lc.m");
      //Insert student data      
     session.insert("Student.insert", student);
      System.out.println("record inserted successfully");
      session.commit();
      session.close();
			
   }
   
}
