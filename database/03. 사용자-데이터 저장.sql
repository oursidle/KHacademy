-- 데이터 저장
-- 테이블에 데이터를 저장하는 구문을 작성
-- (주의) 문자열 외따옴표로 작성(쌍따옴표는 별칭 붙일 때 사용)

-- INSERT INTO 테이블 이름(항목) VALUES(값);

INSERT INTO POCKETMON(NO,name,type) VALUES(1, '이상해씨', '풀');

-- 조회 명령
SELECT * FROM pocketmon;

INSERT INTO POCKETMON(NO,name,type) VALUES(12, '버터플', '벌레');
INSERT INTO POCKETMON(NO,name,type) VALUES(35, '픽시', '페어리');
INSERT INTO POCKETMON(NO,name,type) VALUES(37, '식스테일', '얼음');
INSERT INTO POCKETMON(NO,name,type) VALUES(77, '포니타', '에스퍼');
INSERT INTO POCKETMON(NO,name,type) VALUES(132, '메타몽', '노말');

SELECT * FROM pocketmon;
