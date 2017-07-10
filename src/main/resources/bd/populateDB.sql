DELETE FROM clothing;
DELETE FROM users;

ALTER SEQUENCE global_seq RESTART WITH 10;

-- user
INSERT INTO users (email, password, firstname, lastname, address)
VALUES ('user@yandex.ru', 'password', 'Имя', 'Фамилия', 'адрес');

INSERT INTO clothing ( name, description, price)
VALUES ('джинсы', 'ждинсы подростковые', '500');