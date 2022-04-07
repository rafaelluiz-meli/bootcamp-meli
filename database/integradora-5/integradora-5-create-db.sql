CREATE DATABASE IF NOT EXISTS `biblioteca`;

USE `biblioteca`;

CREATE TABLE IF NOT EXISTS autor (
    idAutor INTEGER(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome varchar(100),
    nacionalidade varchar(100)
);

CREATE TABLE IF NOT EXISTS livro (
    idLivro INTEGER(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    titulo varchar(100),
    editora varchar(100),
    area varchar(100)
);

CREATE TABLE IF NOT EXISTS livroAutor(
  	idLivro INTEGER(6) UNSIGNED,
  	idAutor INT(6) UNSIGNED,
        FOREIGN KEY (idAutor) REFERENCES autor(idAutor),
        FOREIGN KEY (idLivro) REFERENCES livro(idLivro)
);

CREATE TABLE IF NOT EXISTS aluno (
    idAluno INTEGER(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome varchar(100),
  	sobrenome varchar(100),
    endereco varchar(100),
    carreira varchar(100),
    idade int
);

CREATE TABLE IF NOT EXISTS emprestimo (
  	idLeitor INTEGER(6) UNSIGNED,
    idLivro INTEGER(6) UNSIGNED,
    data_emprestimo DATE,
    data_devolucao DATE,
  	retornou bool,
        FOREIGN KEY (idLeitor) REFERENCES aluno(idAluno),
        FOREIGN KEY (idLivro) REFERENCES livro(idLivro)
);

INSERT INTO autor (nome, nacionalidade) values ("Ravier Montecinos","Espanhol");
INSERT INTO autor (nome, nacionalidade) values ("Francis Ligo","Francês");
INSERT INTO autor (nome, nacionalidade) values ("J.K. Rowling","Argelino");
INSERT INTO autor (nome, nacionalidade) values ("Rafael Luiz","Brasileiro");
INSERT INTO autor (nome, nacionalidade) values ("Andrea Bocceli","Italiano");

INSERT INTO livro (titulo, editora, area) values ("Banco de Dados SQL","Salamandra","Matemática");
INSERT INTO livro (titulo, editora, area) values ("HTML5 Iniciante","Abril","Internet");
INSERT INTO livro (titulo, editora, area) values ("O Universo: Guia de Viagem","Salamandra","Suspense");
INSERT INTO livro (titulo, editora, area) values ("Buraco negro no triângulo das bermudas","Abril","Suspense");
INSERT INTO livro (titulo, editora, area) values ("Banco de Dados NO SQL","Folha","Internet");

INSERT INTO aluno (nome, sobrenome, endereco, carreira, idade) values ("Filippo","Galli","Rua galvão, 1","Estudante",11);
INSERT INTO aluno (nome, sobrenome, endereco, carreira, idade) values ("Hugo","Gustavo","Rua juscelino, 100","Médica",35);
INSERT INTO aluno (nome, sobrenome, endereco, carreira, idade) values ("Manuela","Ribeiro","Avenida cinco, 90","Engenharia",24);
INSERT INTO aluno (nome, sobrenome, endereco, carreira, idade) values ("Marina","Lima","Avenida obra, 88","informatica",60);
INSERT INTO aluno (nome, sobrenome, endereco, carreira, idade) values ("Juliana","Gritti","Travessa cinco de março, 9","Estudante",20);

INSERT INTO emprestimo (idLeitor, idLivro, data_emprestimo, data_devolucao, retornou) values (1,3,"2022-03-01","2022-03-10",false);
INSERT INTO emprestimo (idLeitor, idLivro, data_emprestimo, data_devolucao, retornou) values (2,2,"2022-03-01","2022-11-10",false);
INSERT INTO emprestimo (idLeitor, idLivro, data_emprestimo, data_devolucao, retornou) values (1,5,"2022-03-10","2022-08-20",false);
INSERT INTO emprestimo (idLeitor, idLivro, data_emprestimo, data_devolucao, retornou) values (3,3,"2022-03-10","2022-07-20",true);
INSERT INTO emprestimo (idLeitor, idLivro, data_emprestimo, data_devolucao, retornou) values (5,1,"2022-03-20","2022-03-31",true);

INSERT INTO livroAutor values(1,3);
INSERT INTO livroAutor values(2,4);
INSERT INTO livroAutor values(3,5);
INSERT INTO livroAutor values(3,1);
INSERT INTO livroAutor values(4,2);
INSERT INTO livroAutor values(5,1);
