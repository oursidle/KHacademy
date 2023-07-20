----------------------------
-- 수정(Update): 이미 존재하는 데이터의 값을 바꾸는 작업

-- 사용 예: 개인정보 변경, 조회수 증가, 구독/해지, 좋아요, 게시글 수정, ...
-- 형태: update 테이블 이름 set 변경 내용 [조건];
----------------------------

-- 모든 상품의 가격을 0원으로 변경
update product set price = 0;

-- 과자만 0원으로 변경
update product set price = 0 where type = '과자';
update product set price = 0 where type = '생필품';-- 품목이 없더라고 실행은 됨

update product set price = 0, name = '증정품' where type = '과자';

-- 지금까지의 작업을 무효화
rollback;

-- 지금까지의 작업을 확정 저장
commit;

select * from product;

-- Q1: 1번 상품의 가격을 1500원으로 변경
update product set price = 1500 where no = 1;
-- Q2: 스크류바의 가격을 2000원으로 변경
update product set price = 2000 where name = '스크류바';
-- Q3: 멘토스의 가격을 1000원으로 변경 후 분류를 과자로 변경
--	(오라클에는 누적 연산이 없음)
update product set price = 1000, type = '과자' where name = '멘토스';
-- Q4: 과자 가격 500원 할인
update product set price = price-500 where type = '과자';
-- Q5: 아이스크림 가격 10% 인상
update product set price = price*1.1 where type = '아이스크림';
