USE blog_db;

DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS users;


CREATE TABLE posts (
                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                     author varchar(240) NOT Null,
                     title VARCHAR(240) NOT NULL,
                     body TEXT NOT NULL,
                     PRIMARY KEY (id)

);
