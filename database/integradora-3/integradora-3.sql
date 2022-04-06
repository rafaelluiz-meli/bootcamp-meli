-- Mostrar o título e o nome do gênero de todas as séries (primeiro modo)
SELECT s.title, g.name FROM series s, genres g WHERE s.genre_id = g.id;
-- Mostrar o título e o nome do gênero de todas as séries. (segundo modo)
SELECT s.title, g.name FROM series s INNER JOIN genres g ON s.genre_id = g.id;
-- Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em cada um deles.
SELECT CONCAT(a.first_name, ' ' , a.last_name) AS actor, e.title FROM actor_episode ae INNER JOIN actors a ON ae.actor_id = a.id INNER JOIN episodes e ON ae.episode_id = e.id;
-- Mostrar o título de todas as séries e o número total de temporadas que cada uma delas possui.
SELECT s.title, COUNT(se.id) AS Seasons FROM series s INNER JOIN seasons se ON s.id = se.serie_id GROUP BY title;
-- Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.
SELECT g.name, COUNT(*) AS total_films FROM genres g INNER JOIN movies m ON g.id = m.genre_id GROUP BY name HAVING total_films >= 3;
-- Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
SELECT DISTINCT a.first_name, a.last_name FROM actor_movie am JOIN actors a ON am.actor_id = a.id WHERE am.movie_id IN (SELECT id FROM movies WHERE title LIKE 'La Guerra%') GROUP BY first_name, last_name;
