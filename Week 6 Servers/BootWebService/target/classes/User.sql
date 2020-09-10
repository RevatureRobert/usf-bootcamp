create table boot_user (
	id serial primary key,
	username text unique not null,
	password text not null
);