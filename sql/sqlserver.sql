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

-- 查看表结构
sp_help persons3;

-- FOREIGN KEY外键约束
CREATE TABLE orders
(
id int NOT NULL,
order_no varchar(255) NOT NULL,
person_id int,
CONSTRAINT pk_order_id PRIMARY KEY (id)，
CONSTRAINT fk_person_id FOREIGN KEY (person_id) REFERENCES persons(id)
);
GO

-- CHECK 约束用于限制列中的值的范围。
CREATE TABLE orders2
(
id int NOT NULL,
order_no varchar(255) NOT NULL,
person_id int CHECK(person_id>0)
);
GO

-- 视图（临时表）
CREATE VIEW v_person AS
SELECT id, (last_name + ' '+ first_name) as name
FROM persons3;
GO
select * from v_person;
drop view v_person;

-- 函数
CREATE TABLE access_log
(
id int NOT NULL,
address varchar(255) NOT NULL,
count int
);
GO

SELECT * FROM access_log;

-- 查询记录数
SELECT COUNT(*) FROM access_log;

-- 查询第一条记录
SELECT TOP 1 * FROM access_log
ORDER BY count asc;

-- 查询最后一条记录
SELECT TOP 1 * FROM access_log
ORDER BY count desc;

-- 查询count字段最大值
SELECT MAX(count) FROM access_log;

-- 查询count字段最小值
SELECT MIN(count) FROM access_log;

-- 查询count字段和
SELECT SUM(count) FROM access_log;

-- 查询count字段平均值
SELECT AVG(count) AS avgValue FROM access_log;

-- ROUND() 函数用于把数值字段舍入为指定的小数位数。
select ROUND(1.298, 1);
select ROUND(1.298, 0);

-- 查询系统时间
SELECT GETDATE() as today;

-- 时间格式化
DECLARE @Date DATETIME = GETDATE();
SELECT   FORMAT(@Date, 'd', 'ja-JP' ) AS 'Japanese (Japan)',
         FORMAT(@Date, 'd', 'en-US' ) AS 'English (US)';

-- 分组查询
select * from access_log
select address,sum(count) as sum from access_log group by address having address = 'CN';

-- 小写转大写
SELECT UPPER(address) FROM access_log;
-- 大写转小写
SELECT LOWER(address) FROM access_log;
-- LEN() 函数返回文本字段中值的长度。
SELECT LEN(address) FROM access_log;