CREATE DATABASE IF NOT EXISTS post_db;

CREATE USER root@localhost IDENTIFIED BY 'codeup';
GRANT ALL ON post_db.* TO root@localhost;