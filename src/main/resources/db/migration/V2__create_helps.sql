CREATE TABLE `helps` (
  `help_id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `unit_price` int NOT NULL,
  PRIMARY KEY (`help_id`)
) ENGINE=InnoDB;