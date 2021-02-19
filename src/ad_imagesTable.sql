use adlister_db;

CREATE TABLE ad_images (
                           id BIGINT NOT NULL AUTO_INCREMENT,
                           path VARCHAR(255) NOT NULL,
                           ad_id BIGINT,
                           PRIMARY KEY (id),
                           FOREIGN KEY (ad_id) REFERENCES ads(id)
);
CREATE TABLE categories (
                            id BIGINT NOT NULL AUTO_INCREMENT,
                            name VARCHAR(255) NOT NULL,
                            PRIMARY KEY (id)
);

CREATE TABLE ads_categories (
                                ad_id BIGINT NOT NULL,
                                category_id BIGINT NOT NULL,
                                FOREIGN KEY (ad_id) REFERENCES ads(id),
                                FOREIGN KEY (category_id) REFERENCES categories(id)
);