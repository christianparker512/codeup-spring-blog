use adlister_db;

CREATE TABLE ad_images (
                           id BIGINT NOT NULL AUTO_INCREMENT,
                           path VARCHAR(255) NOT NULL,
                           ad_id BIGINT,
                           PRIMARY KEY (id),
                           FOREIGN KEY (ad_id) REFERENCES ads(id)
);