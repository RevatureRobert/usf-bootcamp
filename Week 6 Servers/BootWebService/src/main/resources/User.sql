create table boot_user (
	id serial primary key,
	username text unique not null,
	password text not null
);

insert into boot_user (username, password) values ('boot','pass');
select * from boot_user;