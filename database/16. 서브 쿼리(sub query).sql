-------------------------------------
-- 서브 쿼리(sub query): 여러 개의 구문을 순차적으로 실행하도록 만드는 기술
-------------------------------------

-- ex: 가장 비싼 금액의 상품 정보 조회
select max(price) from product;
select * from product where price = 3000;

-- 위의 예제를 서브 쿼리로 변환
select * from product where price = (select max(price) from product);

-- Q1: 가장 최근에 제조된 상품 정보
select * from product where made = (
	select max(made) from product
	);
-- Q2: 가격이 가장 저렴한 책 정보
select * from book where book_price = (
	select min(book_price) from book
	);
