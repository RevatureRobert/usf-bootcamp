-- views
----a view is a virtual table that holds a result set
----a view can be saved for future reference
select * from person;
create view person_view as select * from person;

select * from person_view;

insert into person values (4, 'pugsly','adams');

-- indexes
----an index is a tool for db's to make operations more efficient
create index person_index on person (ssn);

-- normalization
----it is our attempt to normalize the data inside the db

-- 1st normal form: everything needs a primary key, granularize the data
----for example, person with address column should have it separated into add1, add2, city, state, zip, etc

-- 2nd normal form: needs to be in 1st, and no partial dependencies
---- if there is a composite key, it depends on the entire key and not just part of it.
---- for example, person and address in one table, with their id's being a composite key, the city column would depends
------on the address but not the person.

-- 3 rd normal form: needs to be in 2nd normal form, and no transitive dependencies.
---- every column should depend on the primary key and no other column.

-- Boyd Codd normal Forms: The key, the whole key, and nothing but the key, so help me Codd.


-- functions in psql
create or replace function add(x integer, y integer) returns integer as $add$
declare -- declare the variables here
	z integer;
begin -- begin
	z := x + y; --operation
	return z; --return
end
$add$ language plpgsql; --language declaration

create table something (
	id serial primary key,
	num integer
);
insert into something (num) values (3),(4),(6);
select * from something;






