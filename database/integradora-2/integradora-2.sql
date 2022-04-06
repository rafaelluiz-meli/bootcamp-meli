-- Exibe todos os registros da tabela de filmes.
SELECT * FROM movies;
-- Exibe o nome, sobrenome e classificação de todos os atores.
SELECT first_name, last_name, rating FROM actors;
-- Exibe o título de todas as séries e use alias para que tanto o nome da tabela quanto o campo estejam em Português.
SELECT title AS 'Título' FROM series;
-- Exibe o nome e sobrenome dos atores cuja classificação é superior a 7,5.
SELECT first_name, last_name FROM actors WHERE rating > 7.5;
-- Exibe o título dos filmes, a classificação e os prêmios dos filmes com classificação superior a 7,5 e com mais de dois prêmios.
SELECT title, rating, awards FROM movies WHERE rating > 7.5 AND awards > 2;
-- Exibe o título dos filmes e a classificação ordenados por classificação em ordem crescente.
SELECT title, rating FROM movies ORDER BY rating ASC;
-- Exibe os títulos dos três primeiros filmes no banco de dados.
SELECT title FROM movies LIMIT 3;
-- Exibe os 5 melhores filmes com a classificação mais alta.
SELECT * FROM movies ORDER BY rating DESC LIMIT 5;
-- Lista os 10 primeiros atores.
SELECT * FROM actors LIMIT 10;
-- Exibe o título e a classificação de todos os filmes cujo título é Toy Story.
SELECT title, rating FROM movies WHERE title LIKE 'Toy Story%';
-- Exibe todos os atores cujos nomes começam com Sam.
SELECT * FROM actors WHERE first_name LIKE 'Sam%';
-- Exibe o título dos filmes que saíram entre 2004 e 2008.
SELECT title FROM movies WHERE release_date BETWEEN '2004-01-01' AND '2008-12-31';
-- Exibe o título dos filmes com classificação superior a 3, com mais de 1 prêmio e com data de lançamento entre 1988 e 2009. Ordenar os resultados por classificação.
SELECT title FROM movies WHERE rating > 3 AND awards > 1 AND release_date BETWEEN '2004-01-01' AND '2008-12-31';
