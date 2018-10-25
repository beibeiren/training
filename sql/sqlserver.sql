-- 创建数据库
USE master ;  
GO  
CREATE DATABASE testdb  
ON   
( NAME = testdb_dat,  
    FILENAME = 'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\testdbdat.mdf',  
    SIZE = 10,  
    MAXSIZE = 50,  
    FILEGROWTH = 5 )  
LOG ON  
( NAME = testdb_log,  
    FILENAME = 'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\testdblog.ldf',  
    SIZE = 5MB,  
    MAXSIZE = 25MB,  
    FILEGROWTH = 5MB ) ;  
GO  

-- NOT NULL非空约束
use testdb
GO

CREATE TABLE persons
(
id int NOT NULL,
last_name varchar(255) NOT NULL,
first_name varchar(255),
address varchar(255),
city varchar(255)
);
GO

-- UNIQUE唯一键约束

CREATE TABLE persons2
(
id int NOT NULL,
last_name varchar(255) NOT NULL,
first_name varchar(255),
address varchar(255),
city varchar(255),
CONSTRAINT uk_name UNIQUE (last_name,first_name)
);
GO

-- PRIMARY KEY主键约束
CREATE TABLE persons3
(
id int NOT NULL,
last_name varchar(255) NOT NULL,
first_name varchar(255),
address varchar(255),
city varchar(255),
CONSTRAINT pk_persion_id PRIMARY KEY (id)
);
GO

select * from persons3;


