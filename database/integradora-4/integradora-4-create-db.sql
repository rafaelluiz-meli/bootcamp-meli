DROP `meli`;
CREATE DATABASE IF NOT EXISTS `meli`;

USE `meli`;

CREATE TABLE IF NOT EXISTS `funcionario`(
	cod_fuc VARCHAR(20) NOT NULL,
	nome VARCHAR(20) NOT NULL,
	sobrenome VARCHAR(20) NOT NULL,
	cargo VARCHAR(20) NOT NULL,
	data_alta DATE NULL, 
	salario DOUBLE NOT NULL, 
	comissao DOUBLE NULL,
	depto_nro VARCHAR(10) NOT NULL
);
CREATE TABLE IF NOT EXISTS `departamento`(
	depto_nro VARCHAR(10) NOT NULL,
    nome_depto VARCHAR(20) NOT NULL,
    localizacao VARCHAR(20) NOT NULL
);

INSERT INTO funcionario (cod_fuc, nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES 
('E-0001', 'César', 'Piñero', 'Vendedor', '2018-05-12', '80000', '15000', 'D-000-4');
INSERT INTO funcionario (cod_fuc, nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES 
('E-0002', 'Yosep', 'Kowaleski', 'Analista', '2015-07-14', '140000', '0', 'D-000-2');
INSERT INTO funcionario (cod_fuc, nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES 
('E-0003', 'Mariela', 'Barrios', 'Diretor', '2014-06-05', '185000', '0', 'D-000-3');
INSERT INTO funcionario (cod_fuc, nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES 
('E-0004', 'Jonathan', 'Aguilera', 'Vendedor', '2015-06-03', '85000', '10000', 'D-000-4');
INSERT INTO funcionario (cod_fuc, nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES 
('E-0005', 'Daniel', 'Brezezicki', 'Vendedor', '2018-03-03', '85000', '10000', 'D-000-4');
INSERT INTO funcionario (cod_fuc, nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES 
('E-0006', 'Mito', 'Barchuk', 'Presidente', '2014-06-05', '190000', '0', 'D-000-3');
INSERT INTO funcionario (cod_fuc, nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES 
('E-0007', 'Emilio', 'Galarza', 'Desenvolvedor', '2014-08-02', '60000', '0', 'D-000-1');

INSERT INTO departamento (depto_nro, nome_depto, localizacao) VALUES
('D-000-1', 'Software', 'Los Tigres');
INSERT INTO departamento (depto_nro, nome_depto, localizacao) VALUES
('D-000-2', 'Sistemas', 'Guadalupe');
INSERT INTO departamento (depto_nro, nome_depto, localizacao) VALUES
('D-000-3', 'Contabilidade', 'La Roca');
INSERT INTO departamento (depto_nro, nome_depto, localizacao) VALUES
('D-000-4', 'Vendas', 'Plata');


