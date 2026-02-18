show tables;
show databases;
use prem;
drop table if exists valli;
create table valli
(
EmpNo int primary key,
Ename varchar(20),
job varchar(20),
MGR int(10),
HireDate date,
Salary decimal (10,2),
comm Varchar(10),
DeptNo int
);
 
 insert into valli value(7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
 insert into valli value(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
 insert into valli value(7521,'WARD','SALESMAN',7698,'1981-04-02',1250,NULL,30);
 insert into valli value(7566,'JONES','MANAGER',7839,'1981-02-17',2975,NULL,20);
 insert into valli value(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,NULL,30);
 insert into valli value(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
 insert into valli value(7789,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,30);
 insert into valli value(7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,NULL,20);
 insert into valli value(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
 insert into valli value(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
 insert into valli value(7876,'ADAMS','CLERK',7788,'1987-07-13',1100,NULL,20);
 insert into valli value(7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30);
 insert into valli value(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
 insert into valli value(7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);	

select* FROM VALLI;
SELECT *
FROM VALLI
WHERE JOB = 'MANAGER';

