-- Exibe os dados de todos os autores
SELECT * FROM autor;
-- Exibe nome e idade dos alunos
SELECT CONCAT(nome, ' ' , sobrenome),idade FROM aluno;
-- Exibe apenas os alunos pertencem à carreira de informática
SELECT * FROM aluno WHERE carreira = 'Informatica';
-- Exibe autores de nacionalidade francesa ou italiana
SELECT * FROM autor WHERE nacionalidade LIKE 'Franc%' OR 'Italian%';
-- Exibe livros que não são da área da internet
SELECT * FROM livro WHERE area != 'Internet';
-- Exibe os livros da editora Salamandra
SELECT * FROM livro WHERE editora = 'Salamandra';
-- Exibe os dados dos alunos cuja idade é maior que a média
SELECT * FROM aluno WHERE idade >= (SELECT AVG(idade) FROM aluno);
-- Exibe os nomes dos alunos cujo sobrenome começa com a letra G
SELECT * FROM aluno WHERE sobrenome LIKE 'G%';
-- Exibe nome dos autores do livro "O Universo: Guia de Viagem"
SELECT a.nome FROM livroAutor l INNER JOIN autor a ON l.idAutor = a.idAutor WHERE l.idLivro = (SELECT idLivro FROM livro WHERE titulo = 'O Universo: Guia de Viagem');
-- Exibe autores que tenham nacionalidade italiana ou argentina
SELECT * FROM autor WHERE nacionalidade LIKE 'Italian%' OR 'Argentin%';
-- Exibe os livros que foram emprestados ao leitor “Filippo Galli”
SELECT l.titulo FROM emprestimo e INNER JOIN livro l ON e.idLivro = l.idLivro WHERE e.idLeitor = (SELECT idAluno FROM aluno WHERE nome = 'Filippo' AND sobrenome = 'Galli');
-- Exibe o nome do aluno mais novo
SELECT * FROM aluno WHERE idade = (SELECT MIN(idade) FROM aluno);
-- Exibe os nomes dos alunos a quem os livros de Banco de Dados foram emprestados
SELECT * FROM livro WHERE titulo LIKE 'Banco de Dados%';
-- Exibe os livros que pertencem ao autor J.K. Rowling
SELECT l.titulo FROM livroAutor la INNER JOIN livro l ON la.idLivro = l.idLivro WHERE la.idAutor = (SELECT idAutor FROM autor WHERE nome = 'J.K. Rowling');
-- Exibe os títulos dos livros que deveriam ser devolvidos até 16/07/2021
SELECT l.titulo, data_devolucao FROM emprestimo e INNER JOIN livro l ON e.idLivro = l.idLivro WHERE data_devolucao < '2022-07-16';