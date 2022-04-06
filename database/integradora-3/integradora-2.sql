SELECT s.title, g.name FROM series s, genres g WHERE s.genre_id = g.id;
SELECT s.title, g.name FROM series s INNER JOIN genres g ON s.genre_id = g.id;
SELECT CONCAT(a.first_name, ' ' , a.last_name) AS actor, e.title FROM actor_episode ae INNER JOIN actors a ON ae.actor_id = a.id INNER JOIN episodes e ON ae.episode_id = e.id;
SELECT s.title, COUNT(se.id) AS Seasons FROM series s INNER JOIN seasons se ON s.id = se.serie_id GROUP BY title;
SELECT g.name, COUNT(*) AS total_films FROM genres g INNER JOIN movies m ON g.id = m.genre_id GROUP BY name HAVING total_films >= 3;
SELECT DISTINCT a.first_name, a.last_name FROM actor_movie am JOIN actors a ON am.actor_id = a.id WHERE am.movie_id IN (SELECT id FROM movies WHERE title LIKE 'La Guerra%') GROUP BY first_name, last_name;