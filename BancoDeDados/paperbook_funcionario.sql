-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 10.26.45.241    Database: paperbook
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `idfuncionario` int NOT NULL AUTO_INCREMENT,
  `nomefuncionario` varchar(50) NOT NULL,
  `cpffuncionario` varchar(15) NOT NULL,
  `rgfuncionario` varchar(15) NOT NULL,
  `sexofuncionario` enum('Masculino','Feminino') NOT NULL,
  `datanascimentofuncionario` date NOT NULL,
  `superior` int NOT NULL,
  `idcargo` int NOT NULL,
  `idendereco` int NOT NULL,
  `idcontato` int NOT NULL,
  `idusuario` int NOT NULL,
  PRIMARY KEY (`idfuncionario`),
  UNIQUE KEY `cpffuncionario_UNIQUE` (`cpffuncionario`),
  UNIQUE KEY `rgfuncionario_UNIQUE` (`rgfuncionario`),
  KEY `fk_funcionario_pk_cargo_idx` (`idcargo`),
  KEY `fk_funcionario_pk_endereco_idx` (`idendereco`),
  KEY `fk_funcionario_pk_contato_idx` (`idcontato`),
  KEY `fk_funcionario_pk_usuario_idx` (`idusuario`),
  CONSTRAINT `fk_funcionario_pk_cargo` FOREIGN KEY (`idcargo`) REFERENCES `cargo` (`idcargo`),
  CONSTRAINT `fk_funcionario_pk_contato` FOREIGN KEY (`idcontato`) REFERENCES `contato` (`idcontato`),
  CONSTRAINT `fk_funcionario_pk_endereco` FOREIGN KEY (`idendereco`) REFERENCES `endereco` (`idendereco`),
  CONSTRAINT `fk_funcionario_pk_usuario` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'Marcos','5115669110','13951359','Masculino','1998-06-20',1,1,1,1,1);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-11 17:25:32
