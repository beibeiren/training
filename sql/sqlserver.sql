-- 创建数据库
USE master ;  
GO  
CREATE DATABASE testdb  
ON   
( NAME = testdb_dat,  
    FILENAME = 'D:\Microsoft SQLServer\MSSQL14.MSSQLSERVER\MSSQL\DATA\testdbdat.mdf',  
    SIZE = 10,  
    MAXSIZE = 50,  
    FILEGROWTH = 5 )  
LOG ON  
( NAME = testdb_log,  
    FILENAME = 'D:\Microsoft SQLServer\MSSQL14.MSSQLSERVER\MSSQL\DATA\testdblog.ldf',  
    SIZE = 5MB,  
    MAXSIZE = 25MB,  
    FILEGROWTH = 5MB ) ;  
GO  

-- NOT NULL非空约束
use testdb
GO

CREATE TABLE persons
(
id int Identity(1, 1) NOT NULL, -- Identity(1,1) 主键自增,从1开始每次递增1
last_name varchar(255) NOT NULL,
first_name varchar(255),
address varchar(255),
city varchar(255)
);
GO

-- PRIMARY KEY主键约束
ALTER TABLE persons ADD CONSTRAINT pk_persion_id PRIMARY KEY (id);
GO

-- UNIQUE唯一键约束
ALTER TABLE persons ADD CONSTRAINT uk_name UNIQUE (last_name, first_name);
GO

select * from persons3

-- 查看表结构
sp_help persons;

-- FOREIGN KEY外键约束
CREATE TABLE orders
(
id int NOT NULL,
order_no varchar(255) NOT NULL,
count int,
person_id int,
CONSTRAINT pk_order_id PRIMARY KEY (id)， -- 主键约束
CONSTRAINT fk_person_id FOREIGN KEY (person_id) REFERENCES persons(id) -- 外键约束
);
GO

-- CHECK 约束用于限制列中的值的范围。
ALTER TABLE persons ADD CONSTRAINT ck_count CHECK (count > 0);
GO

-- 设定默认值
ALTER TABLE orders ADD CONSTRAINT  person_id_def DEFAULT 1 for person_id;
GO

-- 视图（临时表）
CREATE VIEW v_person AS
SELECT id, (last_name + ' ' + first_name) as name
FROM persons;
GO

select * from v_person where id = 1;

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



-- 分组查询
select * from access_log
select address,sum(count) as sum from access_log group by address having address = 'CN';

-- 小写转大写
SELECT UPPER(address) FROM access_log;
-- 大写转小写
SELECT LOWER(address) FROM access_log;
-- LEN() 函数返回文本字段中值的长度。
SELECT LEN(address) FROM access_log;


-- 时间截取
DECLARE @Date DATETIME = GETDATE();
select DATEPART(yy,@Date) as year, DATEPART(mm,@Date) as month, DATEPART(dd,@Date) as day;
GO

-- 时间加减 
select DATEADD(yy, -30, GETDATE()) as year;

select DATEADD(mm, 12, GETDATE()) as month;

select DATEADD(dd, 7, GETDATE()) as day;

-- DATEDIFF() 函数返回两个日期之间的天数。（后面减前面）
select DATEDIFF(yy, GETDATE(), DATEADD(yy, 11, GETDATE())) as year;

-- 时间格式转换
select CONVERT(VARCHAR(19),GETDATE())
select CONVERT(DATE,GETDATE(),111)
select CONVERT(VARCHAR(10),GETDATE(),110)
select CONVERT(VARCHAR(11),GETDATE(),6)
select CONVERT(VARCHAR(11),GETDATE(),106)
select CONVERT(VARCHAR(24),GETDATE(),113)

-- 时间格式化
DECLARE @Date DATETIME = GETDATE();
SELECT   FORMAT(@Date, 'd', 'ja-JP' ) AS 'Japanese (Japan)',
         FORMAT(@Date, 'd', 'en-US' ) AS 'English (US)';