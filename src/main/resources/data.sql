CREATE DATABASE IF NOT EXISTS rentacar;

USE rentacar;

CREATE TABLE IF NOT EXISTS car (
                                   id INT AUTO_INCREMENT PRIMARY KEY,
                                   brand VARCHAR(255),
                                   model VARCHAR(255)
                               );

INSERT INTO car (id, brand, model) VALUES
                                       (1, 'Ford', 'Fiesta'),
                                       (2, 'Renault', 'Megane'),
                                       (3, 'Fiat', 'Egea'),
                                       (4, 'Toyota', 'Auris'),
                                       (5, 'Audi', 'A6'),
                                       (6, 'Peugeot', '508'),
                                       (7, 'Seat', 'Leon'),
                                       (8, 'Nissan', 'Qashqai'),
                                       (9, 'Mercedes', 'S500'),
                                       (10, 'Maserati', 'Quattroporte');


