CREATE TABLE IF NOT EXISTS `customer` (
    `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
    `name` varchar(100) NOT NULL,
    `email` varchar(100) NOT NULL,
    `mobile_number` varchar(100) NOT NULL,
    `created_at` date DEFAULT NULL,
    `created_by` varchar(100) DEFAULT NULL,
    `updated_at` date DEFAULT NULL,
    `updated_by` varchar(100) DEFAULT NULL
    );

INSERT INTO CUSTOMER ( name, email, mobile_number) VALUES ( 'Hrihtik007','muttinhrithik@gmail.com', '8904824329' );
INSERT INTO CUSTOMER ( name, email, mobile_number) VALUES ( 'Hrihtik008','muttinhrithik@gmail.com', '8904824329' );

CREATE TABLE IF NOT EXISTS `accounts` (
    `customer_id` int NOT NULL,
    `account_number` int AUTO_INCREMENT  PRIMARY KEY,
    `account_type` varchar(100) NOT NULL,
    `branch_address` varchar(200) NOT NULL,
    `created_at` date NOT NULL,
    `created_by` varchar(100) NOT NULL,
    `updated_at` date DEFAULT NULL,
    `updated_by` varchar(100) DEFAULT NULL
    );