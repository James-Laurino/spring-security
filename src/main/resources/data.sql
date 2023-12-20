CREATE TABLE IF NOT EXISTS users (
id serial primary key,
username VARCHAR(45) NOT NULL,
password VARCHAR(255) NOT NULL,
enabled VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS authorities (
id serial primary key,
username VARCHAR(45) NOT NULL,
authority VARCHAR(45) NOT NULL
);



INSERT INTO users
(username, password, enabled)
VALUES
    ('thomas', '{noop}1234', '1');

INSERT INTO authorities
(username,authority)
VALUES
    ('thomas', 'write');
