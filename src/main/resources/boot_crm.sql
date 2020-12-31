-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: localhost    Database: boot_crm
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_customer`
--

DROP TABLE IF EXISTS `tb_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_customer` (
  `cust_id` int NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(50) DEFAULT NULL,
  `cust_user_id` int DEFAULT NULL,
  `cust_create_id` int DEFAULT NULL,
  `cust_source` varchar(50) DEFAULT NULL,
  `cust_industry` varchar(50) DEFAULT NULL,
  `cust_level` varchar(32) DEFAULT NULL,
  `cust_linkman` varchar(50) DEFAULT NULL,
  `cust_phone` varchar(64) DEFAULT NULL,
  `cust_mobile` varchar(16) DEFAULT NULL,
  `cust_zipcode` char(10) DEFAULT NULL,
  `cust_address` varchar(100) DEFAULT NULL,
  `cust_createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_customer`
--

LOCK TABLES `tb_customer` WRITE;
/*!40000 ALTER TABLE `tb_customer` DISABLE KEYS */;
INSERT INTO `tb_customer` VALUES (3,'小李',NULL,1,'09','03','11','2342','1234567654','345643','210048','','2020-12-30 01:44:25'),(4,'小李',NULL,1,'08','03','11','2342','1234567654','345643','210048','','2020-12-30 01:45:40'),(5,'小李',NULL,1,'07','02','10','2342','1234567654','345643','210048','','2020-12-30 02:00:03'),(6,'小李',NULL,1,'07','02','11','2342','1234567654','345643','210048',NULL,'2020-12-30 02:25:00'),(7,'小张',NULL,1,'09','02','10','2342','1234567654','345643','210048',NULL,'2020-12-30 02:25:34'),(8,'小李',NULL,1,'07','03','10','2342','1234567654','345643','210048',NULL,'2020-12-30 02:27:08'),(9,'小张',NULL,1,'08','02','11','2342','1234567654','345643','210048',NULL,'2020-12-30 02:27:32'),(10,'小李',NULL,1,'08','02','10','2342','1234567654','345643','210048',NULL,'2020-12-30 02:27:57'),(11,'小李',NULL,1,'07','02','10','2342','1234567654','345643','210048',NULL,'2020-12-30 02:28:19'),(12,'小张',NULL,1,'07','02','10','2342','1234567654','345643','210048',NULL,'2020-12-30 02:29:00'),(13,'小李',NULL,1,'08','02','11','2342','1234567654','345643','210048',NULL,'2020-12-30 23:32:53');
/*!40000 ALTER TABLE `tb_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_dict`
--

DROP TABLE IF EXISTS `tb_dict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_dict` (
  `dict_id` varchar(32) NOT NULL,
  `dict_type_code` varchar(10) DEFAULT NULL,
  `dict_type_name` varchar(50) DEFAULT NULL,
  `dict_item_name` varchar(50) DEFAULT NULL,
  `dict_item_code` varchar(10) DEFAULT NULL,
  `dict_sort` int DEFAULT NULL,
  `dict_enable` char(1) DEFAULT NULL,
  `dict_memo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_dict`
--

LOCK TABLES `tb_dict` WRITE;
/*!40000 ALTER TABLE `tb_dict` DISABLE KEYS */;
INSERT INTO `tb_dict` VALUES ('01','001','所属行业','教育培训','001',NULL,'1',NULL),('02','001','所属行业','对外贸易','002',NULL,'1',NULL),('03','001','所属行业','电子商务','003',NULL,'1',NULL),('04','001','所属行业','酒店管理','001',NULL,'1',NULL),('05','001','所属行业','房地产','002',NULL,'1',NULL),('06','001','所属行业','软件开发','003',NULL,'1',NULL),('07','002','客户来源','电话营销','001',NULL,'1',NULL),('08','002','客户来源','网络营销','002',NULL,'1',NULL),('09','002','客户来源','售前','003',NULL,'1',NULL),('10','006','客户级别','普通客户','001',NULL,'1',NULL),('11','006','客户级别','VIP客户','002',NULL,'1',NULL);
/*!40000 ALTER TABLE `tb_dict` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_code` varchar(32) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_password` char(32) DEFAULT NULL,
  `user_state` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (1,'zhangsan','张三','e10adc3949ba59abbe56e057f20f883e','1'),(2,'lisi','李四','e10adc3949ba59abbe56e057f20f883e','1'),(3,'wangwu','王五','e10adc3949ba59abbe56e057f20f883e','1'),(4,'zhaoliu','赵六','e10adc3949ba59abbe56e057f20f883e','1');
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-31 14:57:59
