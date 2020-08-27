--DCL
create user jdbc_user with password 'wasspord';

grant all privileges on database postgres to jdbc_user;


-- constraints
-- essentially rules applied to entire columns
--  there different types of constraints.
--		unique, not null, primary key, check, default, foreign key

-- unique means that all values in the column must all be different
-- not null means that a column can never lack a value
-- primary key is a combination of unique and not null constraints and is meant to be a identifier for a table
-- default gives the column a default value if one is not given upon insertion
-- check checks to make sure a given rule is applied when working with inserts or updates
-- foreign key is an identifier on a table that points to another table. this is how we can achieve relationships between tables

create table better_table (
	id integer primary key,
	username text unique,
	password text not null
);

select * from better_table;

insert into better_table values (1,'user','kjhiyg'),(2,'user2','ujygfctgrfx');

drop table better_table;