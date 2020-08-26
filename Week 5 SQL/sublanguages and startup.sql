-- postgresql is a relational database management system
--  this means it takes care of internal functions and systems
--  and keeps relations between the tables.

-- we use tables to store data. The columns represent the 
--	the different attributes for our records. Think about 
--	the fields for your objects. each row is a record that
--	follows the rules for the table. Think about the indivual
--	instances for your classes.

-- sublanguages of sql
--	sql stands for Structured Query language
--		dml, ddl, dql, tcl, dcl
--			dml = data manipulation language
--				keywords: select, insert, update, delete
--select column_name from some_table;
--			ddl = data definition language
--				keywords: create, alter, drop, truncate
--			dql = data query language
--				keywords: select
--			dcl = data control language
--				keywords: grant, revoke
---			tcl = transaction control language
--				keywords: commit, begin, rollback, savepoint
create table table_name (
	id integer,
	username text,
	password varchar(200),
	age integer
);

select username from table_name;

-- datatypes 
--		numeric		integer, float, serial
--		Strings		char, varchar, text
--		boolean		true and false

---DML EXAMPLES
--	select all columns
select username, password from table_name;
select * from table_name;

-- inserting
-- insert into table (columns) values (values)
insert into table_name (id, username, password, age) values (1, 'chair','sit', 22);
insert into table_name (username, password) values ('i can come in alone','but are you really alone???');
--insert into table values (all column values)
insert into table_name values (2, 'sgiouh','iujghiu',55);
--insert into table values (all column values),(all column values), (all column values);
insert into table_name values (44,'hgrehg','hjgiueg',45), (487, 'ijhgnb','ihngg',45);


--updating
-- update table set column = newValue where someColumn = someValue
update table_name set age=70 where username='chair';

-- deleting
-- delete table where someColumn = someValue
delete from table_name where id=487;




--- DDL EXAMPLES
-- create
create table other_table (
	here boolean
);
select * from other_table;
insert into other_table values (true),(false),(true);

-- alter
alter table other_table add column brain_check text;
alter table other_table drop column brain_check;

--truncate deleting all the data inside the table, but leaving the structure
truncate other_table;

-- drop fully deletes whatever resource it is being applied to.
drop table other_table;



-- DQL EXAMPLES

--queries
select * from table_name;
-- narrow the results
select * from table_name where id >= 2;
select * from table_name where age <50;
select * from table_name where age is null;
select * from table_name where age is not null;
--ordering the results
select * from table_name order by age;
select * from table_name order by username desc;
select * from table_name order by username asc;
--chain them together
select * from table_name where age > 40 order by username;
select * from table_name where age > 40 and id < 40 order by username;
select * from table_name where age > 40 or id < 40 order by username;


--DCL EXAMPLES

-- grant
grant privileges to user username for table, schema, something;

-- revoke
revoke privileges to user username for table, schema, something;


-- TCL EXAMPLES

begin
	insert into table_name values (343,'rgsfdgr','srgfrf',34);
	update table_name set password = 'pass1' where age < 100;
rollback;
commit;
end

select * from table_name;

--ACID
-- acid is the properties of a transaction
-- 	A = atomic which means that transactions will never halfway complete, it is all or nothing
--	C = consistent, which means that the state will properly change after each transaction and all rules will be followed
--	I = Isolated, transactions should be isolated of each other and not interfere
--	D = Durability, if something disasterous happens, the data still exists.