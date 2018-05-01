-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- En lo que al diseño se refiere si bien se podría haber incluído una tabla distinta para las ciudades y provincias he preferido no hacerlo ya que el uso de la base de datos parece ser
-- meramente provincial y basta con incluir el nombre de la ciudad. Se entiende, además, que cada año se celebra una competición semejante y que los equipos cambian, así, esta base de 
-- datos será empleada en una única edición, debiendo añadir una tabla de ediciones con las categorías participantes y premios(junto al número y fecha de la edición)
-- para futuras ediciones, eliminando la columna id_premio de la tabla equipos.

-- ---
-- Table 'Institutos'
-- 
-- ---
-- Create schema Olimipadas;
DROP TABLE IF EXISTS `Institutos`;
		
CREATE TABLE `Institutos` (
  `id_Instituto` INTEGER NOT NULL AUTO_INCREMENT,
  `Nombre` CHAR NOT NULL,
  `Direccion` VARCHAR(40) NULL DEFAULT NULL,
  `Ciudad` VARCHAR (40)NULL DEFAULT NULL,
  `Telefono` INTEGER NULL DEFAULT NULL,
  `email` VARCHAR (40)NULL DEFAULT NULL,
  `Responsable` VARCHAR (40)NULL DEFAULT NULL,
  PRIMARY KEY (`id_Instituto`)
);

-- ---
-- Table 'Alumnos'
-- 
-- ---

DROP TABLE IF EXISTS `Alumnos`;
		
CREATE TABLE `Alumnos` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR (40)NULL DEFAULT NULL,
  `Apellidos` VARCHAR (40)NULL DEFAULT NULL,
  `Telefono` INTEGER NULL DEFAULT NULL,
  `email` VARCHAR (40)NULL DEFAULT NULL,
  `Direccion` VARCHAR (40)NULL DEFAULT NULL,
  `id_Instituto` INTEGER NOT NULL ,
  `id_Modulo` INTEGER NOT NULL ,
  `id_Equipo` INTEGER NOT NULL ,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'Estudios'
-- 
-- ---

DROP TABLE IF EXISTS `Estudios`;
		
CREATE TABLE `Estudios` (
  `id` INTEGER Not NULL AUTO_INCREMENT,
  `Nombre` VARCHAR (40)NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'Premios'
-- 
-- ---

DROP TABLE IF EXISTS `Premios`;
		
CREATE TABLE `Premios` (
  `id` INTEGER Not NULL AUTO_INCREMENT,
  `Medalla` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'Equipos'
-- 
-- ---

DROP TABLE IF EXISTS `Equipos`;
		
CREATE TABLE `Equipos` (
  `id` INTEGER Not NULL AUTO_INCREMENT,
  `id_Estudios` INTEGER NOT NULL ,
  `id_Instituto` INTEGER NOT NULL ,
  `id_premio` INTEGER Not NULL ,
  PRIMARY KEY (`id`)
);

-- ---
-- Foreign Keys 
-- ---

ALTER TABLE `Alumnos` ADD FOREIGN KEY (id_Instituto) REFERENCES `Institutos` (`id_Instituto`);
ALTER TABLE `Alumnos` ADD FOREIGN KEY (id_Modulo) REFERENCES `Estudios` (`id`);
ALTER TABLE `Alumnos` ADD FOREIGN KEY (id_Equipo) REFERENCES `Equipos` (`id`);
ALTER TABLE `Equipos` ADD FOREIGN KEY (id_Estudios) REFERENCES `Estudios` (`id`);
ALTER TABLE `Equipos` ADD FOREIGN KEY (id_Instituto) REFERENCES `Institutos` (`id_Instituto`);
ALTER TABLE `Equipos` ADD FOREIGN KEY (id_premio) REFERENCES `Premios` (`id`);
alter table alumnos add  Fecha_Nacimiento date  after Apellidos;
alter table alumnos add  Sexo char(1)  after Apellidos;