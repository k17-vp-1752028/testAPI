-- Database: store_data

-- DROP DATABASE IF EXISTS store_data;

CREATE DATABASE store_data
    WITH
    OWNER = lozittut
    ENCODING = 'UTF8'
    LC_COLLATE = 'Vietnamese_Vietnam.1258'
    LC_CTYPE = 'Vietnamese_Vietnam.1258'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
CREATE TABLE workers (
	id INT,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
	date_of_birth DATE,
	PRIMARY KEY(id)
);

-- ALTER TABLE workers
-- DROP COLUMN fist_name;

-- ALTER TABLE workers
-- ADD first_name VARCHAR(255);

INSERT INTO workers (id, first_name, last_name, date_of_birth) VALUES (2, 'Long', 'Nguyen Hoang', '1999-07-13');

SELECT * FROM workers;