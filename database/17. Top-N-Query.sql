-----------------------------------
-- Top N Query: 데이터를 원하는 구간만큼 끊어내는 구문

-- 오라클, rownum 값을 조회 시 사용 가능
-- rownum: 조회 결과에 순서를 부여

-- 형태: select * from (
--				select rownum rn, TMP.* from(
--				원하는 순서로 정렬하는 구문 
--				)TMP
--			) where rn between 시작 and 종료;
-----------------------------------

-- Q: 상품을 번호 순으로 3개 조회
-- Q: 상품을 가격이 저렴한 순으로 3개 조회

select * from product order by price asc;
select * from product order by price desc;
select * from product order by no asc;

select rownum, product.* from product order by price asc;
select rownum, product.* from product order by price desc;
select rownum, product.* from product order by no asc;

-- 정렬을 먼저한 후 rownum을 나중에 부여하도록 구조 개선
select rownum, TMP.* from (
	select * from product order by price asc
) TMP where rownum <= 3;

-- 문제점: 중간부터는 조회가 불가능
select rownum, TMP.* from (
	select * from product order by price asc
) TMP where rownum  between 3 and 5;

-- 해결책: rownum을 먼저 붙인 후 조회하도록 서브쿼리 추가
-- 문제점: rownum 은 select를 붙일 때마다 생김
select * from (
	select rownum, TMP.* from (
	select * from product order by price asc
	)TMP
) where rownum between 3 and 5;

-- 해결책: 두 번째 select에서 발생한 rownum 에 별칭 부여
select * from (
	select rownum rn, TMP.* from (
	select * from product order by price asc
	)TMP
) where rn between 3 and 5;


-- Q1: 가격이 가장 비싼 책 Top 5 조회
select * from (
	select rownum rn, TMP.* from(
	select * from book order by book_price desc
	)TMP
) where rn <= 5;
select * from (
	select rownum rn, TMP.* from(
	select * from book order by book_price desc
	)TMP
) where rn between 1 and 5;
-- Q2: 제목이 가장 짧은 책 Top 3 조회
select * from (
	select rownum rn, TMP.* from(
	select * from book order by book_title asc
	)TMP
) where rn <= 3;
select * from (
	select rownum rn, TMP.* from(
	select * from book order by length(book_title) asc
	)TMP
) where rn between 1 and 3;
-- Q3: 출간한 지 가장 오래된 책 6등~10등 조회
select * from (
	select rownum rn, TMP.* from(
	select * from book order by book_publication_date asc
	)TMP
) where rn between 6 and 10;
