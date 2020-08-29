--constraints and relationships
----to recap constraints
----constraints: unique, not null, primary key, foreign key, default, and check
----there are a few types of primary keys, natural key, surrogate key, composite key

--ONE TO MANY, MANY TO ONE
create table person (
	ssn integer primary key,
	firstname text not null,
	lastname text not null,
	address integer references address unique
);

create table address (
	id integer primary key,
	line1 text not null,
	line2 text,
	city text not null,
	state text null,
	zipcode integer not null
);

drop table person


insert into person values (1, 'tom','adams', null);
select * from person;
insert into address values (1, '555 fifth st','apt 2', 'tampa','fl',33640);
select * from address;
update person set address=1 where ssn=1;
select * from person;


--relationships
----we have four types of relationships: one to one, one to many, many to one, many to many
insert into person values (2,'susan','adams',1);
select * from person;
----to achieve a one to many or a many to one, we just add a foreign key


--ONE TO ONE
create table person (
	ssn integer primary key,
	firstname text not null,
	lastname text not null,
	address integer references address unique
);

create table address (
	id integer primary key,
	line1 text not null,
	line2 text,
	city text not null,
	state text null,
	zipcode integer not null
);

insert into person values (1, 'tom','adams', null);
update person set address=1 where ssn=1;
select * from person;
insert into person values (2,'susan','adams',1);
----to achieve a one to one relationship, make the foreign key unique


--MANY TO MANY
create table owner (
	id integer primary key,
	firstname text not null,
	lastname text not null
);

create table pet (
	id integer primary key,
	name text not null,
	type text not null
);

----junction table
create table owner_pet_junction (
	owner integer references owner,
	pet integer references pet
);

insert into owner values (1, 'tom','adams'), (2, 'susan', 'adams');
insert into pet values (1, 'scruffs mcguffs','dog'), (2, 'feline beeline','cat');
select * from owner;
select * from pet;
insert into owner_pet_junction values (1,1),(1,2),(2,1),(2,2);
select * from owner_pet_junction;

----to achieve a many to many relationship, we need a third table called a junction table

--joins and unions
----a join will join to tables together at the rows
----we have a few different kinds of joins: inner join, outer join (left outer, right outer, full outer), self joins, and cross joins
select * from person inner join address on person.address=address.id;
select * from person left join address on person.address=address.id;
select * from person right join address on person.address=address.id;
select * from person full outer join address on person.address=address.id;

insert into person values (2,'susan','adams'),(3,'wednesday','adams');
insert into address values (2,'555 something st','suite a','tampa','fl',33640), (3,'555 nowhere rd','apt 5','orlando','fl', 33555);
select * from person;

select * from address inner join person on address.id=person.address;
select * from owner o inner join owner_pet_junction j on o.id=j.owner inner join pet on j.pet=pet.id;
--self join
select * from person a inner join person b on a.ssn=b.ssn;
--cross join
select * from person a cross join address b;
select * from "Artist" cross join "Album";
select count("Artist"."ArtistId") from "Artist" cross join "Album";
select count ("ArtistId") from "Artist";
select count ("AlbumId") from "Album";


--UNIONS OR SET OPERATORS
----a union will join two tables together at the columns
----rules for unions: 
------1. there needs to be the same number of columns
------2. the columns must be the same type
----types of unions: minus, intersect, union, union all

create table A (
	id integer primary key,
	color text not null
);

create table B (
	id text primary key,
	shape text not null
);

insert into A values (1, 'blue'),(2,'red'),(3,'grey');
insert into B values ('oiasfidjh','rectangle'),('kjrgh','triangle'),('rtfgh','octogon');

insert into A values (4,'rectangle'),(5,'triangle');
insert into B values ('roiugh','blue'),('erijhgb','red');

select color as something from A union select shape from B; --takes out duplicates
select color from A union all select shape from B; --leaves duplicates
select color from A except select shape from B; --A - B = whats left in A
select shape from B except select color from A; -- B - A = whats left in B
select color from A intersect select shape from B; -- intersect leaves whatever is in both
