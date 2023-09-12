create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20),myname varchar(20),father_name varchar(20),dob varchar(20),gender varchar(20), email varchar(40),address varchar(50),marital_status varchar(20),city varchar(20),state varchar(25),pincode varchar(20));

show tables;

select * from signup;

create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20), income varchar(20),education varchar(20), occupation varchar(40),pan varchar(50),senior_citizen varchar(20),existing_account varchar(20));

select * from signuptwo;

create table signupthree(formno varchar(20),account_type varchar(20),cardnumber varchar(20),pinnumber varchar(20),facility varchar(20));

select * from signupthree;

create table login(formno varchar(20),cardnumber varchar(20),pin varchar(10));

select * from login;

drop table bank;

create table bank(cardnumber varchar(20),pin varchar(20),date varchar(50),type varchar(10),amount varchar(20));

select * from bank;
