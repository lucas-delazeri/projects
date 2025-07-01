CREATE DATABASE IF NOT EXISTS testebancopi;
USE testebancopi;

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeProd VARCHAR(50),
    descricaoProd VARCHAR(100),
    categoriaProd CHAR(50),
    tamanhoProd CHAR(2),
    corProd VARCHAR(12),
    precoVenda DECIMAL(10,2),
    precoCompra DECIMAL(10,2),
    dataCompra DATE
);
