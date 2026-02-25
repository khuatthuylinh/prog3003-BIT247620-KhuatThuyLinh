CREATE DATABASE chuong5;
USE chuong5;

CREATE TABLE users(
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100),
    email VARCHAR(100)
);

INSERT INTO users(username,email)
VALUES
('anh','anh@gmail.com'),
('tuan','tuan@gmail.com'),
('linh','linh@gmail.com');

CREATE TABLE products(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price DOUBLE
);