CREATE TABLE `children` (
  `child_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `birthday` date NOT NULL,
  PRIMARY KEY (`child_id`)
) ENGINE=InnoDB;