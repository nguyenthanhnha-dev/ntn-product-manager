CREATE TABLE category (
  id BIGINT PRIMARY KEY,
	name VARCHAR(100) NOT NULL
);

CREATE TABLE product (
  id BIGINT PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	price DECIMAL(11,2) NOT NULL,
	category_id INT REFERENCES category(id), 
	version INT
);


