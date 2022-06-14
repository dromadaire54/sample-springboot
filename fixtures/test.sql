CREATE DATABASE `test_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `test_db`;
CREATE TABLE `person` (
  `ID_PERSON` int(10) NOT NULL AUTO_INCREMENT,
  `USUAL_LAST_NAME` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `BIRTH_LAST_NAME` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `FIRST_NAME` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID_PERSON`)
) ENGINE=InnoDB AUTO_INCREMENT=344318 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;