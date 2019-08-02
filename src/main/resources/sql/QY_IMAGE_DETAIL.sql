/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.18-log : Database - filesys
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`filesys` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `filesys`;

/*Table structure for table `qy_image_detail` */

DROP TABLE IF EXISTS `qy_image_detail`;

CREATE TABLE `qy_image_detail` (
  `ID` varchar(32) NOT NULL COMMENT '文件id，唯一标识',
  `FILE_ORGINAL_NAME` varchar(64) NOT NULL COMMENT '文件的原始名称',
  `FILE_NAME` varchar(64) NOT NULL COMMENT '文件名称',
  `FILE_CODE_TYPE` varchar(32) NOT NULL COMMENT '文件类型',
  `FILE_UPLOAD_TIME` varchar(64) NOT NULL COMMENT '文件上传时间',
  `FILE_UPLOAD_USERNAME` varchar(32) NOT NULL COMMENT '文件上传人',
  `AUTHOR` varchar(32) DEFAULT NULL COMMENT '作者',
  `FILE_DESCRIPTION` varchar(128) DEFAULT NULL COMMENT '文件描述',
  `FILE_SIZE` varchar(20) DEFAULT NULL COMMENT '文件大小',
  `ORGINAL_FILE_PATH` varchar(64) DEFAULT NULL COMMENT '原始文件路径',
  `COMPRESS_FILE_PATH` varchar(64) DEFAULT NULL COMMENT '压缩文件路径',
  `FILE_TYPE` varchar(64) DEFAULT NULL COMMENT '文件类型',
  `AUTHOR_ID` varchar(32) DEFAULT NULL COMMENT '作者id',
  `FILE_UPLOAD_USERID` varchar(32) DEFAULT NULL COMMENT '上传文件用户ID',
  `FILE_HEIGHT` int(10) DEFAULT NULL COMMENT '文件高度（原始图片高度）',
  `FILE_WIDTH` int(10) DEFAULT NULL COMMENT '文件宽度（原始图片宽度）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qy_image_detail` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
