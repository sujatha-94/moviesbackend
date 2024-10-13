-- schema.sql

CREATE TABLE IF NOT EXISTS movie (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100) NOT NULL,
    is_popular BOOLEAN NOT NULL,
    rating DECIMAL(3, 2) NOT NULL, -- Assuming rating can be a decimal with 2 places
    release_date DATE NOT NULL,
    poster_path VARCHAR(255) NOT NULL
);
