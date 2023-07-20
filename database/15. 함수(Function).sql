-----------------------------------
-- 함수(Function): 입력과 출력으로 이루어진 기능 집합(호출 시 작업해주는 도구)
-- 함수와 메소드의 차이점: 함수는 단독으로 있을 수 있지만 메소드는 단독으로 있을 수 없음
-----------------------------------

-- <단일행 함수>: 입력과 출력이 1대1인 함수
select book_title from book;
select upper(book_title) from book;
select lower(book_title) from book;
select length(book_title) from book;

select * from book where lower(book_title) like 'harry%';

-- <집계 함수>: 데이터를 모아 하나의 결과를 만드는 함수
select max(book_price) from book;
select min(book_price) from book;
select sum(book_price) from book;
select avg(book_price) from book;
select count(book_price) from book;-- null 항목은 세지 않음
select count(*) from book;-- null 관계 없이 사용하고 싶을 때 사용

-- (주의): 집계함수는 정해진 자리에만 사용 가능
/*select * from book where book_price = max(book_price);-- 틀린 구문*/

-- <분석 함수>
