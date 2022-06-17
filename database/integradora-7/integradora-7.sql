-- Adiciona um filme à tabela de filmes
INSERT INTO movies VALUES (22, NULL, NULL, 'Eu sou a Lenda', 9.0, 9, '2007-10-04 00:00:00', 140, 5);
-- Adiciona um gênero à tabela de gêneros
INSERT INTO genres VALUES (13, '2022-04-08 00:00:00', NULL, 'Brasileiro', 13, 1);
-- Associa o filme com o gênero adicionado acima
UPDATE movies SET genre_id = 13 WHERE id = 22;
-- Modifique a tabela de atores para que pelo menos um ator tenha o filme adicionado no ponto 1 como favorito

-- Cria uma tabela temporária da tabela filmes
CREATE TEMPORARY TABLE movies_tmp SELECT * FROM movies;
-- Elimine dessa tabela temporária todos os filmes que ganharam menos de 5 prêmios
SELECT * FROM movies_tmp;
-- Obtenha a lista de todos os gêneros que possuem pelo menos um filme

-- Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios

-- Crie um índice no nome na tabela de filmes

-- Verifique se o índice foi criado corretamente

-- No banco de dados movies, haveria uma melhoria notável na criação de índices
