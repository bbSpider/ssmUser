/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50018
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-06-26 12:16:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_tab
-- ----------------------------
DROP TABLE IF EXISTS `user_tab`;
CREATE TABLE `user_tab` (
  `id` int(3) NOT NULL auto_increment,
  `name` varchar(255) character set koi8u default NULL,
  `password` varchar(255) default NULL,
  `age` int(5) default NULL,
  `sex` varchar(255) character set utf8 default NULL,
  `birthday` varchar(255) default NULL,
  `idcard` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
