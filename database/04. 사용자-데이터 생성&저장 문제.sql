-- 1번 문제
CREATE TABLE SCORE(
grade NUMBER,
class NUMBER,
name varchar(21),
korean NUMBER,
english NUMBER,
math NUMBER
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
CREATE TABLE account(
name varchar2(21),
period number,
round number,
paid number,
balance number
);

INSERT INTO account(name, period, round, paid, balance)
values('유재석', 3, 15, 100, 1500);
INSERT INTO account(name, period, round, paid, balance)
values('강호동', 2, 5, 50, 250);
INSERT INTO account(name, period, round, paid, balance)
values('신동엽', 2, 8, 80, 1000);

SELECT * FROM account;
