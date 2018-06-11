CREATE TABLE `tbvendas` (
idvenda int(11) NOT NULL AUTO_INCREMENT,
nomeprod varchar(45) DEFAULT NULL,
idcomanda varchar(45) DEFAULT NULL,
cliente varchar(45) DEFAULT NULL,
valorvenda double DEFAULT NULL,
filial varchar(45),
PRIMARY KEY (idvenda)
);


