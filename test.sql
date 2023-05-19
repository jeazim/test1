/*
 Navicat MySQL Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 19/05/2023 21:24:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for s_course
-- ----------------------------
DROP TABLE IF EXISTS `s_course`;
CREATE TABLE `s_course`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `hours` int NULL DEFAULT NULL,
  `sid` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sid`(`sid`) USING BTREE,
  CONSTRAINT `s_course_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `s_school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of s_course
-- ----------------------------
INSERT INTO `s_course` VALUES (1, 'C语⾔程序设计', 70, 1);
INSERT INTO `s_course` VALUES (2, 'Python程序设计', 70, 1);
INSERT INTO `s_course` VALUES (3, '⼤学英语', 96, 2);
INSERT INTO `s_course` VALUES (4, '⾼级Web技术', 40, 1);
INSERT INTO `s_course` VALUES (5, '”⼤数据存储', 32, 1);

-- ----------------------------
-- Table structure for s_school
-- ----------------------------
DROP TABLE IF EXISTS `s_school`;
CREATE TABLE `s_school`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `school_name` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of s_school
-- ----------------------------
INSERT INTO `s_school` VALUES (1, '计算机学院');
INSERT INTO `s_school` VALUES (2, '外国语学院');

SET FOREIGN_KEY_CHECKS = 1;
