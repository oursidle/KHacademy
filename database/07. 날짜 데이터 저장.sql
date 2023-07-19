/*
	날짜 데이터 다루기
	- date 형태를 사용하며 연/월/일/시/분/초 까지 저장
	- 날짜 혹은 시간만 저장해야하는 경우 문자열의 형태로도 저장함
	- 날짜는 형식이 지정되어 있어 따로 설정하지 않음
*/

drop table emp;
create table emp(
emp_no number primary key,
emp_name varchar2(21) not null check(regexp_like(emp_name, '^[가-힣]{2,7}$')),
emp_salary number not null check(emp_salary >= 0),
emp_join date default sysdate not null
);

-- 시간은 문자열의 형태로도 넣을 수 있음(형식은 국가별로 다름)
insert into emp(emp_no, emp_name, emp_salary, emp_join)
values(1, '김사장', 100000000, '2021-01-01');

-- 문자열을 변환 명령을 사용해 작성할 수 있음
insert into emp(emp_no, emp_name, emp_salary, emp_join)
values(2, '최상무', 80000000, to_date('2021-02-01', 'yyyy-MM-dd'));

-- sysdate 항목을 사용해 시간을 구해서 넣을 수 있음
insert into emp(emp_no, emp_name, emp_salary, emp_join)
values(3, '박전무', 75000000, sysdate);

insert into emp(emp_no, emp_name, emp_salary)
values(4, '이부장', 50000000);

select * from emp;
