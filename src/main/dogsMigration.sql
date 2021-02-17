USE adlister_db;

DROP TABLE IF EXISTS dogs;



CREATE TABLE dogs (
                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                     age VARCHAR(240) NOT NULL,
                     name TEXT NOT NULL,
                     reside_state
                     PRIMARY KEY (id)

);