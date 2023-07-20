-----------------------------
-- 삭제(Delete): 데이터베이스에 저장된 값을 영구적으로 제거하는 것

-- commit, rollback 영향 받음

-- delete [from] 테이블 이름 [조건];
-- delete 테이블 이름 [조건];
-----------------------------

-- 전부 삭제(비추천)
delete product;

rollback;

select * from product;

-- Q1: 1번 상품과 정보 삭제
delete product where no = 1;
-- Q2: 과자와 아이스크림 상품 정보 삭제
delete product where type = '과자' or type = '아이스크림';
delete product where type in ('과자', '아이스크림');
-- Q3: 2020년 상반기에 생산한 상품 정보 삭제
delete product where extract(month from made) between 1 and 6;
delete product where to_char(made, 'mm') in ('01', '02', '03', '04', '05', '06');
delete product
	where made between
		to_date('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
		and
		to_date('2020-06-30 00:00:00', 'yyyy-mm-dd hh24:mi:ss')
		;
