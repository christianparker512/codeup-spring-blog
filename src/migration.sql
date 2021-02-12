USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;


CREATE TABLE ads (
                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                     title VARCHAR(240) NOT NULL,
                     description TEXT NOT NULL,
                     PRIMARY KEY (id)

);
