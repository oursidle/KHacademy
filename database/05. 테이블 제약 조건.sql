/*
	테이블 제약 조건(table constraint)
	- 보관할 데이터의 유효성을 검사하기 위해 컬럼에 설정하는 조건
	- 'and' 키워드로 &&처리
	- 'or' 키워드로 || 처리
	- 'not' 키워드로 !처리
	- 'between' 키워드로 두 숫자의 사이 값 처리(구간 설정)
	- '=' 키워드가 같다는 의미로 처리
	- in(a, b, c)는 a, b, c 중 하나라는 의미
	
	조건의 종류
	- check: 추가할 데이터의 형식 검사를 설정(null 제외)
	- (중요) not null: 해당 항목의 null을 허용하지 않겠다는 설정(필수 항목)
	- unique: 특정 항목의 중복을 허용하지 않겠다는 설정(묶음 처리 가능: 복합키)
*/

-- 04. 문제 1 조건 추가
drop table score;
create table score(
grade number check(grade >= 1),
room number check(room >= 1),
name varchar2(21) check(regexp_like(name, '^[가-힣]{2,7}$')),
--korean number(3) check(korean >= 0 and korean <= 100),
korean number(3) check(korean between 0 and 100),
english number(3) check(english between 0 and 100),
math number(3) check(math between 0 and 100)
);
 
-- 지정된 형식을 벗어나느 값 추가되지 않음
insert into score(grade, room, name, korean, english, math)
values(-5, 1, '테스트', 10, 20, 30);


-- 04. 문제 2 조건 추가
drop table account;
create table account(
account_owner varchar2(21) check(regexp_like(account_owner, '^[가-힣]{2,7}$')),
account_period number check(account_period in(1, 2, 3, 5, 10)),
account_round number check(account_round >= 1),
account_payment number check(account_payment > 0 and mode(account_payment, 10000) = 0),
account_balance number check(account_balance >= 0)
);

insert into account(account_owner, account_period, account_round, account_payment, account_balance)
values('유재석', 3, 15, 100, 1500);
insert into account(account_owner, account_period, account_round, account_payment, account_balance)
values('강호동', 2, 5, 50, 250);
insert into account(account_owner, account_period, account_round, account_payment, account_balance)
values('신동엽', 2, 8, 80, 1000);


-- 04. 문제 1 값 조건, null 조건 추가
drop table score;
create table score(
grade number not null check(grade >= 1),
room number not null check(room >= 1),
name varchar2(21) not null check(regexp_like(name, '^[가-힣]{2,7}$')),
--korean number(3) check(korean >= 0 and korean <= 100),
korean number(3) check(korean between 0 and 100),
english number(3) check(english between 0 and 100),
math number(3) check(math between 0 and 100)
);

insert into score(grade, room, name, korean, english, math)
values(1, 1, '테스트', null, null, null);
insert into score(grade, room, name, korean, english, math)
values(1, 2, '테스트', 10, 20, 40);

select * from score;


-- 04. 문제 1 값 조건, null 조건, unique 추가
drop table score;
create table score(
grade number not null check(grade >= 1),
room number not null check(room >= 1),
name varchar2(21) not null check(regexp_like(name, '^[가-힣]{2,7}$')),
--korean number(3) check(korean >= 0 and korean <= 100),
korean number(3) check(korean between 0 and 100),
english number(3) check(english between 0 and 100),
math number(3) check(math between 0 and 100),
unique(grade, room, name)
);

insert into score(grade, room, name, korean, english, math)
values(1, 2, '테스트', 10, 20, 40);

select * from score;
