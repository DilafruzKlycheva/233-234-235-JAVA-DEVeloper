--Yorum satırı
/*
çoklu yorum satır
*/

------------------  DAY'1 DT  ------------------
--1-database oluşturma--DDL
CREATE DATABASE deneme;
--SQL komutlarında küçük/büyük harf duyarlılığı yoktur
--fakat datalarda ve değişken isimlerinde duyarlılık vardır.
create database deneme2

--2-database silme--DDL
DROP DATABASE deneme2;
DROP DATABASE tped_dt;--cannot drop the currently open database 

--3-tablo oluşturma--DDL
CREATE TABLE students(
id CHAR(4),
name VARCHAR(25),
grade REAL,
register_date DATE
);












