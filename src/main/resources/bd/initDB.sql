DROP TABLE IF EXISTS orders_clothinglist;
DROP TABLE IF EXISTS clothing;
DROP TABLE IF EXISTS orders CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 10;


CREATE TABLE users
(
  id         int8 PRIMARY KEY DEFAULT nextval('global_seq'),
  email      VARCHAR NOT NULL UNIQUE,
  password   VARCHAR NOT NULL,
  registered TIMESTAMP DEFAULT now(),
  firstname  VARCHAR,
  lastname   VARCHAR,
  address    VARCHAR,
  phone      VARCHAR
);

CREATE TABLE clothing (
  id              int8 PRIMARY KEY DEFAULT nextval('global_seq'),
  name            VARCHAR NOT NULL,
  description     TEXT,
  imagePath       VARCHAR,
  price           INT NOT NULL
);

CREATE TABLE orders (
  id          int8 PRIMARY KEY DEFAULT nextval('global_seq'),
  registered  TIMESTAMP DEFAULT now(),
  status      VARCHAR,
  users_id     int8 REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE orders_clothinglist (
  orders_id    int8 REFERENCES orders (id) ON DELETE CASCADE,
  clothing_id  int8 REFERENCES clothing (id)
);

