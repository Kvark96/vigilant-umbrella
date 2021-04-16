/*
    You might want to rename the database to your own needs.
    If so, please substitute `startcode` with whatever your project is called.
 */

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cupcake
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cupcake
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cupcake` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `cupcake` ;

-- -----------------------------------------------------
-- Table `cupcake`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cupcake`.`users` (
                                                 `user_id` INT NOT NULL AUTO_INCREMENT,
                                                 `email` VARCHAR(90) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `role` VARCHAR(20) NOT NULL DEFAULT 'customer',
    `balance` DOUBLE NULL,
    PRIMARY KEY (`user_id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
    ENGINE = InnoDB
    AUTO_INCREMENT = 4
    DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `cupcake`.`bottoms`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cupcake`.`bottoms` (
                                                   `product_id` INT NOT NULL,
                                                   `name` VARCHAR(45) NULL,
    `price` DOUBLE NULL,
    PRIMARY KEY (`product_id`))
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cupcake`.`toppings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cupcake`.`toppings` (
                                                    `product_id` INT NOT NULL,
                                                    `name` VARCHAR(45) NULL,
    `price` DOUBLE NULL,
    PRIMARY KEY (`product_id`))
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cupcake`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cupcake`.`orders` (
                                                  `order_id` INT NOT NULL,
                                                  `user_id` INT NULL,
                                                  `created` TIMESTAMP NULL DEFAULT current_timestamp,
                                                  PRIMARY KEY (`order_id`),
    INDEX `fk_orders_users1_idx` (`user_id` ASC) VISIBLE,
    CONSTRAINT `fk_orders_users1`
    FOREIGN KEY (`user_id`)
    REFERENCES `cupcake`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cupcake`.`orderline`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cupcake`.`orderline` (
                                                     `orderline_id` INT NOT NULL,
                                                     `top_id` INT NULL,
                                                     `bottom_id` INT NULL,
                                                     `quantity` INT NULL,
                                                     `order_id` INT NULL,
                                                     PRIMARY KEY (`orderline_id`),
    INDEX `fk_products_bottoms1_idx` (`bottom_id` ASC) VISIBLE,
    INDEX `fk_products_toppings1_idx` (`top_id` ASC) VISIBLE,
    INDEX `fk_orderline_orders1_idx` (`order_id` ASC) VISIBLE,
    CONSTRAINT `fk_products_bottoms1`
    FOREIGN KEY (`bottom_id`)
    REFERENCES `cupcake`.`bottoms` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_products_toppings1`
    FOREIGN KEY (`top_id`)
    REFERENCES `cupcake`.`toppings` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_orderline_orders1`
    FOREIGN KEY (`order_id`)
    REFERENCES `cupcake`.`orders` (`order_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;

