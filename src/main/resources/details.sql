/*
 Navicat Premium Data Transfer

 Source Server         : localDB
 Source Server Type    : MySQL
 Source Server Version : 100134
 Source Host           : localhost:3306
 Source Schema         : details

 Target Server Type    : MySQL
 Target Server Version : 100134
 File Encoding         : 65001

 Date: 16/08/2018 22:41:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `BRANCH` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `PERCENTAGE` int(3) NOT NULL,
  `PHONE` int(10) NOT NULL,
  `EMAIL` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'Mohammad', 'It', 80, 9000999, 'mohamad123@yahoo.com');
INSERT INTO `student` VALUES (4, 'Anuwat', 'Programmer', 60, 1166542, 'kk@lc.m');
INSERT INTO `student` VALUES (5, 'zara', 'EEE', 90, 123412341, 'zara@gmail.com');
INSERT INTO `student` VALUES (6, 'zara', 'EEE', 90, 123412341, 'zara@gmail.com');
INSERT INTO `student` VALUES (7, 'zara', 'EEE', 90, 984802233, 'Shyam123@yahoo.com');
INSERT INTO `student` VALUES (8, 'zara', 'EEE', 90, 123412341, 'zara@gmail.com');
INSERT INTO `student` VALUES (10, 'zara', 'EEE', 90, 123412341, 'zara@gmail.com');
INSERT INTO `student` VALUES (11, 'zara', 'EEE', 90, 123412341, 'zara@gmail.com');
INSERT INTO `student` VALUES (12, 'zara', 'EEE', 90, 123412341, 'zara@gmail.com');
INSERT INTO `student` VALUES (13, 'zara', 'EEE', 90, 123412341, 'zara@gmail.com');

-- ----------------------------
-- Procedure structure for read_recordById
-- ----------------------------
DROP PROCEDURE IF EXISTS `read_recordById`;
delimiter ;;
CREATE PROCEDURE `read_recordById`(IN emp_id INT)
BEGIN 
      SELECT * FROM STUDENT WHERE ID = emp_id; 
   END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
