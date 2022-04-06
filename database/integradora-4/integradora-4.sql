-- Exibe o nome, cargo e localização dos departamentos onde os vendedores trabalham.
SELECT f.nome, f.cargo, d.localizacao FROM funcionario f INNER JOIN departamento d ON f.depto_nro = d.depto_nro;
-- Exibe departamentos com mais de cinco funcionários.
SELECT d.nome_depto, COUNT(f.depto_nro) AS qtdFuncionarios FROM departamento d INNER JOIN funcionario f ON d.depto_nro = f.depto_nro GROUP BY nome_depto;
-- Exibe o nome, salário e nome do departamento dos funcionários que têm o mesmocargo que 'Mito Barchuk'.
SELECT f.nome, f.sobrenome, f.salario, d.nome_depto FROM funcionario f INNER JOIN departamento d ON f.depto_nro = d.depto_nro WHERE d.depto_nro IN (SELECT depto_nro FROM funcionario WHERE nome = 'Mito' AND sobrenome = 'Barchuk');
-- Exibe os dados dos funcionários que trabalham no departamento de contabilidade, ordenados por nome.
SELECT * FROM funcionario f WHERE depto_nro IN (SELECT depto_nro FROM departamento WHERE nome_depto = 'Contabilidade') ORDER BY f.nome;
-- Exibe o nome do funcionário que tem o menor salário.
SELECT nome, sobrenome, salario FROM funcionario WHERE salario IN (SELECT MIN(salario) FROM funcionario);
-- Exibe os dados do funcionário que tem o maior salário no departamento 'Vendas'.
SELECT * FROM funcionario WHERE depto_nro IN (SELECT depto_nro FROM departamento WHERE nome_depto = 'Vendas') ORDER BY salario DESC LIMIT 1;
