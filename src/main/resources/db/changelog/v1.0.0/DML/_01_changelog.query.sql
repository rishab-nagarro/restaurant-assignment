-- liquibase formatted sql

-- changeset rishabbhatnagar:populate-menu-static-data
INSERT INTO menu (id, name, category, price) VALUES (1, 'Pizza', 'food',100.0);
INSERT INTO menu (id, name, category, price) VALUES (2, 'Burger', 'food',100.0);
INSERT INTO menu (id, name, category, price) VALUES (3, 'Beer', 'alcoholic',100.0);
INSERT INTO menu (id, name, category, price) VALUES (4, 'Wine', 'alcoholic',100.0);
INSERT INTO menu (id, name, category, price) VALUES (5, 'Coke', 'non-alcoholic',100.0);
INSERT INTO menu (id, name, category, price) VALUES (6, 'Juice', 'non-alcoholic',100.0);
