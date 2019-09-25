/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.14 : Database - sgcalamidades
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sgcalamidades` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `sgcalamidades`;

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `DTYPE` varchar(31) NOT NULL,
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `contacto` varchar(255) DEFAULT NULL,
  `dataNascimento` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `nrDocumento` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `tipoDeDocumento` varchar(255) DEFAULT NULL,
  `idCentro` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_funcionario`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

insert  into `funcionario`(`DTYPE`,`id_funcionario`,`contacto`,`dataNascimento`,`email`,`estado`,`nome`,`nrDocumento`,`sexo`,`tipoDeDocumento`,`idCentro`,`senha`,`usuario`) values ('Operador',4,NULL,NULL,NULL,'\0','Humei Jocordasse',NULL,'Masculino',NULL,NULL,NULL,NULL),('Operador',3,NULL,NULL,NULL,'\0','Humei Jocordasse Kazembe',NULL,'Masculino',NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
