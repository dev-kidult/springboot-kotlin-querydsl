create table IF NOT EXISTS user (
    id bigint primary key auto_increment,
    name varchar(100) null,
    password varchar(100) null,
    email varchar(100) null
);

insert into user(name, password, email)
VALUES ('yonghui', '1234', 'doole3488@gmail.com');