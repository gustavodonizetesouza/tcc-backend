-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 07-Maio-2019 às 01:10
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tcc_backend`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

DROP TABLE IF EXISTS `aluno`;
CREATE TABLE `aluno` (
  `cpf` int(11) NOT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `uf` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`cpf`, `cidade`, `email`, `endereco`, `nome`, `senha`, `telefone`, `uf`) VALUES
(1, 'Belo Horizonte', 'professor@professor.com', 'PUCMinas', 'Professor', '$2a$10$0BOscoyJ/nzXB4yVXR6WSOqep7VMgkp1P7fdZjckjvxAxxzd6YCm.', '(31)3319-4444', 'MG'),
(2, 'Belo Horizonte', 'g@g.com', 'TCC', 'Gustavo', '$2a$10$.CN4sYtyhAQy8RnVXTzpyef7r03lQARoTucokxAd9V62XgY6vl.Xu', '(35)8822-5913', 'MG'),
(3, 'São Paulo', 'fabio_aparecido@gmail.com', 'Avenida Brasil', 'Fábio Aparecido', '$2a$10$ic4sOYVUMvfAhJQeH0o8A.KpmqFXQkJvh7GN1KKqL/AAo4v4SVjeW', '(00)3333-1122', 'SP'),
(4, 'São Paulo', 'jose_luiz@gmail.com', 'Avenida Paulista', 'José Luiz', '$2a$10$mmAEbf90p0O0y7SEwyKHkOZFFPoCV1rdV3s2.upRjWBanTk3zU0PW', '(21)2121-2122', 'SP'),
(5, 'Rio de Janeiro', 'irene_souza@hotmail.com', 'Navegantes', 'Irene Souza', '$2a$10$YQuc3ngSC8W5C6m4r34lV.aFezAcEA5emL87QWaqGrbiZcp0LPdhO', '(11)1111-1111', 'RJ'),
(6, 'Curitiba', 'priscilafaria@yahoo.com.br', 'Ponte Nova', 'Priscila Faria', '$2a$10$Hr.olIG1t4gt367zmJZW5e3OsvcttXzMp9sd5JBCPDQjDdKm1jdNG', '(41)4433-4343', 'PR');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
