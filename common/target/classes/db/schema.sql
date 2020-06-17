DROP table if exists order_test;
drop table if exists message_queue_log;
drop table if exists generator;

create table order_test (

    id varchar(32) not null,
    name varchar(64),
    message_queue_log varchar(32) not null,
    primary key (id)
);

create table message_queue_log(

    id varchar(32) not null,
    state int(1) default 0,
    create_time date ,
    update_time date ,
    count int(1) default 0,
    primary key (id)
);

create table generator(

    id varchar(32) not null,
    name varchar(64),
    primary key (id)
);