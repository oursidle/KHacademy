
-- 문제 1: 월드컵 선수 정보
CREATE TABLE worldcup(
rank number(38),
name varchar2(30),
nation varchar2(30),
goal number(2)
);

-- 문제 2: 메달리스트 정보
CREATE TABLE medalist(
name varchar2(21),
event varchar2(30),
type varchar2(6),
gold number,
silver number,
bronze number
);

-- 문제 3: 통신사 요금제 정보
-- 통신사가 무조건 두 자리라면 고정 문자열(char) 처리
-- (장점) 빠른 처리 속도
-- (단점) 글자 수 달라질 수 없음
DROP TABLE plan;
CREATE TABLE plan(
telecom char(2),
name varchar2(60),
month_price number,--설정하지 않으면 38자리로 기본 설정
DATA number,
CALL  number,
sms number
);

-- 문제 4: 커피숍 메뉴 정보
-- (참고) 테이블 자료형에는 논리가 없음
-- Y/N 또는 1/0으로 처리함
DROP TABLE menu;
CREATE TABLE menu(
name varchar2(60),
TYPE varchar2(9),
price number,
event char(1)
);
