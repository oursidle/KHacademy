-- 1번 문제
DROP table
CREATE TABLE SCORE(
grade NUMBER(1),
room NUMBER,
name varchar2(21),
korean NUMBER(3),
english NUMBER(3),
math NUMBER(3)
);

INSERT INTO score(grade, class, name, korean, english, math)
VALUES(1, 1, '마리오', 50, 60, 50);
INSERT INTO score(grade, class, name, korean, english, math)
VALUES(1, 1, '루이지', 60, 90, 50);
INSERT INTO score(grade, class, name, korean, english, math)
VALUES(1, 2, '쿠파', 70, 70, 80);
INSERT INTO score(grade, class, name, korean, english, math)
VALUES(1, 2, '요시', 80, 85, 35);

SELECT * FROM score;

-- 2번 문제
-- 이름 작성 시 예약어에 주의
-- 테이블 이름을 앞에 작성하거나, 이름을 '_'로 길게 작성
DROP TABLE account;
CREATE TABLE account(
account_owner varchar2(21),
account_period number,
account_round number,
account_payment number,
account_balance number
);

INSERT INTO account(account_owner, account_period, account_round, account_payment, account_balance)
values('유재석', 3, 15, 100, 1500);
INSERT INTO account(account_owner, account_period, account_round, account_payment, account_balance)
values('강호동', 2, 5, 50, 250);
INSERT INTO account(account_owner, account_period, account_round, account_payment, account_balance)
values('신동엽', 2, 8, 80, 1000);

SELECT * FROM account;
