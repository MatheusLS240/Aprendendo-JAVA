-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18/11/2025 às 04:26
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ordem_servico`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `ordem_servico_pendente`
--

CREATE TABLE `ordem_servico_pendente` (
  `id_ordemServico` int(11) NOT NULL,
  `cliente` varchar(100) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cpf_cnpj` varchar(20) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `dataPedido` date NOT NULL DEFAULT current_timestamp(),
  `dataEntrega` date NOT NULL,
  `discriminacao` text NOT NULL,
  `total` decimal(10,0) NOT NULL,
  `valorPago` decimal(10,0) NOT NULL,
  `valorRestando` double GENERATED ALWAYS AS (`total` - `valorPago`) VIRTUAL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `ordem_servico_pendente`
--
ALTER TABLE `ordem_servico_pendente`
  ADD PRIMARY KEY (`id_ordemServico`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `ordem_servico_pendente`
--
ALTER TABLE `ordem_servico_pendente`
  MODIFY `id_ordemServico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
