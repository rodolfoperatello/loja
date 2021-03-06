CREATE TABLE CATEGORY(
CATEGORY_ID SERIAL PRIMARY KEY,
NAME varchar(50) NOT NULL
);

CREATE TABLE PRODUCT(
PRODUCT_ID SERIAL PRIMARY KEY,
NAME varchar(50) NOT NULL,
PRICE decimal(6,2) NOT NULL,
CATEGORY_ID integer NOT NULL
);

ALTER TABLE PRODUCT ADD CONSTRAINT PRODUCT_CATEGORY FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORY(CATEGORY_ID);