/*
	조회(SELECT)
	- 테이블의 데이터를 원하는 목적에 맞게 선택적으로 조회
*/

create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');


-- 기본 조회 (전체 조회)
select * from product; -- '*' 와일드 카드

-- 이름 조회
select name from product;

-- 이름, 가격 조회
select name, price from product;

-- 없는 항목 조회 불가능
-- select name, price, point from product;

-- 항목을 계산해서 조회
-- 날짜 계산 시 기본 처리 단위는 일
select name, expire-made+1 from product;

-- 조회한 항목에 표시될 이름 지정 가능(별칭 설정)
-- 한 칸 띄어쓰면 별칭으로 인식, 띄어쓰기가 있는 경우 쌍따옴표로 별칭 처리
select name "이름", expire-made+1 "유통기한" from product;


---------------------------------
-- 조건 (where): 조회 결과를 원하는 방향으로 필터링
---------------------------------

-- <숫자 조건>
-- 2000원 이상인 상품 정보 조회
select * from product where price >= 2000;

-- 1000원 이상 2000원 이하인 상품 정보 조회
select * from product where price >= 1000 and price <= 2000;
select * from product where price between 1000 and 2000; -- 다용

-- '=' 같다 / '!=', '<>' 같지 않다
select * from product where price = 1000;
select * from product where price != 1000;
select * from product where price <> 1000;

-- <문자열 조건>
-- 문자열도 같음을 '='로 처리
-- like. instr()로 유사 검색 가능
-- 	시작검색에서는 like 성능 우수
--	다른 부분에서는  전체적으로 instr() 성능이 우수
--	복잡한 검색은 like 사용
select * from product where name = '스크류바';

select * from product where name like '스크%'; -- '%' 유무 모두 가능
select * from product where instr(name, '스크') = 1; -- 'instr()' 위치 찾는 명령

select * from product where name like '%이%';
select * from product where instr(name, '이') > 0;

select * form product where name like '오%오';


-- Q1: 과자, 아이스크림 조회
select * from product where type = '과자' or type = '아이스크림';
select * from product where type in ('과자', '아이스크림');
-- Q2: 이름에 '초코'가 포함된 삼품 정보 조회(instr()이 좋음)
select * from product where name like '%초코%';-- '%'이 앞에 있으면 like 성능 하락
select * from product where instr(name, '초코') > 0;
-- Q3: 이름이 '바나나'로 시작하는 상품 정보 조회
select * from product where instr(name, '바나나') = 1;
select * from product where name like '바나나%';
-- Q4: 이름에 '이'가 포함되지 않은 상품 정보 조회
select * from product where name not like '%이%';
select * from product where instr(name, '이') = 0;
-- Q4: 가격이 1000원 이상인 과자 조회
select * from product where type = '과자' and  price >= 1000;


-- <날짜 조건>
-- 기본 형식: yyyy-mm-dd hh24:mi:ss (hh는 12시간 방식)
-- 문자열로 조회 가능하지만 운영체제에 따라 작동 여부 결정됨(비추천)
-- 문자열로 변환 시 to_char() 키워드 사용
-- 날짜 추출용 함수인 extract()을 사용하여 원하는 항목 추출 가능

-- Q: 2020년에 제조된 상품 조회
-- select * from product where made like '2020%';(비추천)
select * from product where to_char(made, 'yyyy') = '2020';
select * from product where extract(year from made) = 2020;
select * from product where 
	made between
	to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
	and
	to_date('2020-12-31 23:59:59', 'yyyy-mm-dd hh24:mi:ss')
	;
	
-- Q1: 여름(6, 7, 8)월에 생산한 상품 제품 조회
select * from product where extract(month from made) between 6 and 8;
select * from product where to_char(made, 'mm') in ('06', '07', '08');
-- Q2: 2019년 하반기(7월 1일~12월 31일)에 생사한 상품 정보 조회
select * from product where extract(month from made)
	between 7 and 12 and extract(year from made) = 2019;
select * from product where to_char(made, 'yyyy-mm')
	in ('2019-07', '2019-08', '2019-09', '2019-10', '2019-11', '2019-12');
select * from product where made between
		to_date('2019-07-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
	and
		to_date('2019-12-31 00:00:00', 'yyyy-mm-dd hh24:mi:ss');
-- Q3: 2020년부터 현재까지 생산한 상품 정보 조회
select * from product where made between
		to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
	and
		sysdate;
-- Q4: 최근 1년간 생산한 상품 정보 조회(날짜 기본 계산 단위 '일'. 따라서 1년 전은 sysdate-365)
select * from product where made between sysdate-365 and sysdate;

-- (응용) 시간가지 고려(시작일 00시부터 종료일 23시 59분까지)
select * from product
	where made between
		to_date(to_char(sysdate-365, 'yyyy-mm-dd')||''||'00:00:00',
		'yyyy-mm-dd hh24:mi:ss')
	and
		to_date(to_char(sysdate, 'yyyy-mm-dd')||''||'23:59:59',
		'yyyy-mm-dd hh24:mi:ss')
	;
