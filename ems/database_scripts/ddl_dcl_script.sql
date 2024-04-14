--Problem Statement

-- Create an MVC project using Spring Boot & Thymeleaf (Employee
-- Management System) and perform the following operations using appropriate mappings
--  1. View all records from the database table.
--  2. Insert new records into the table.
--  3. Update an existing record in the table.
--  4. Delete existing records from the table.

-- Please note: Do not run in Postgres Transactional Block, instead run in 'sql shell' of postgres

-- dropping pre existing table/schema/database related to EMS
drop table if exists emsschema.employee;
drop schema if exists emsschema; 
drop database if exists ems;

-- Creating ems database
create database ems with owner postgres;

-- Connecting to ems database
\c ems postgres

-- Creating and granting privileges to emsschema
create schema emsschema authorization postgres;
grant all on schema emsschema to postgres;
grant all on schema emsschema to public;
comment on schema emsschema is 'ems schema';
