-- liquibase formatted sql

-- changeset rishabbhatnagar:create-table-menu
CREATE TABLE menu (
id int NOT NULL,
name VARCHAR(255) NOT NULL,
category VARCHAR(255) NOT NULL,
price NUMERIC(20, 2) NOT NULL);
ALTER TABLE MENU ADD CONSTRAINT menu_pkey PRIMARY KEY (id);

