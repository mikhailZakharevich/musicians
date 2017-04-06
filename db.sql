CREATE TABLE `music`.`instrument` (
  `instrument_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`instrument_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

  CREATE TABLE `music`.`area` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(100) NULL DEFAULT NULL,
  `places` INT NOT NULL,
  PRIMARY KEY (`id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
  
  CREATE TABLE `music`.`event` (
  `event_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `date` DATE NULL DEFAULT NULL,
  `area` INT NOT NULL,
  PRIMARY KEY (`event_id`),
  CONSTRAINT `FK_AREA`
    FOREIGN KEY (`area`)
    REFERENCES `music`.`area` (`id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
    
  CREATE TABLE `music`.`band` (
  `band_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `genre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`band_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
  
  CREATE TABLE `music`.`artist` (
  `artist_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `band` INT NULL DEFAULT NULL,
  PRIMARY KEY (`artist_id`),
  CONSTRAINT `FK_BAND`
    FOREIGN KEY (`band`)
    REFERENCES `music`.`band` (`band_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
    
    CREATE TABLE `music`.`ticket` (
  `ticket_id` INT NOT NULL AUTO_INCREMENT,
  `price` FLOAT NOT NULL,
  `event` INT NOT NULL,
  PRIMARY KEY (`ticket_id`),
  CONSTRAINT `FK_EVENT`
    FOREIGN KEY (`event`)
    REFERENCES `music`.`event` (`event_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
    
    CREATE TABLE `music`.`artist_instrument` (
  `artist_id` INT NOT NULL,
  `instrument_id` INT NOT NULL,
  PRIMARY KEY (`artist_id`, `instrument_id`),
  CONSTRAINT `FK_ARTIST`
    FOREIGN KEY (`artist_id`)
    REFERENCES `music`.`artist` (`artist_id`),
  CONSTRAINT `FK_INSTRUMENT`
    FOREIGN KEY (`instrument_id`)
    REFERENCES `music`.`instrument` (`instrument_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

   CREATE TABLE `music`.`artist_event` (
  `artist_id` INT NOT NULL,
  `event_id` INT NOT NULL,
  PRIMARY KEY (`artist_id`, `event_id`),
  CONSTRAINT `ref_artist`
    FOREIGN KEY (`artist_id`)
    REFERENCES `music`.`artist` (`artist_id`),
  CONSTRAINT `ref_event`
    FOREIGN KEY (`event_id`)
    REFERENCES `music`.`event` (`event_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE `music`.`band_event` (
  `band_id` INT NOT NULL,
  `event_id` INT NOT NULL,
  PRIMARY KEY (`band_id`, `event_id`),
  CONSTRAINT `ref_event1`
    FOREIGN KEY (`event_id`)
    REFERENCES `music`.`event` (`event_id`),
  CONSTRAINT `ref_band`
    FOREIGN KEY (`band_id`)
    REFERENCES `music`.`band` (`band_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE `music`.`artist_composition` (
  `artist_id` INT NOT NULL,
  `composition_id` INT NOT NULL,
  PRIMARY KEY (`artist_id`, `composition_id`),
  CONSTRAINT `ref_singer`
    FOREIGN KEY (`artist_id`)
    REFERENCES `music`.`artist` (`artist_id`),
  CONSTRAINT `ref_composition`
    FOREIGN KEY (`composition_id`)
    REFERENCES `music`.`composition` (`composition_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE `music`.`band_composition` (
  `composition_id` INT NOT NULL,
  `band_id` INT NOT NULL,
  PRIMARY KEY (`composition_id`, `band_id`),
  CONSTRAINT `ref_singers`
    FOREIGN KEY (`band_id`)
    REFERENCES `music`.`band` (`band_id`),
  CONSTRAINT `ref_song`
    FOREIGN KEY (`composition_id`)
    REFERENCES `music`.`composition` (`composition_id`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
