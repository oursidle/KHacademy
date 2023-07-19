drop table board;
create table board(
board_no number not null unique check(board_no > 0),
board_title varchar2(300) not null,
board_content varchar2(4000) not null,
board_writer varchar2(20) check(regexp_like(board_writer, '^[A-Za-z0-9]{8,20}$')),
board_readcount number check(board_readcount >= 0)
--unique (board_no)
);

insert into board(board_no, board_title, board_content, board_writer, board_readcount)
values(1, '테스트제목', '테스트내용' , 'testuser1', 5);

select * from board;

-- 등록 시 항목을 제외시키면 null이 들어감
-- null이 아니라 다른 값을 초기값으로 넣고 싶다면 default 키워드 사용 가능
drop table board;
create table board(
board_no number not null unique check(board_no > 0),
board_title varchar2(300) not null,
board_content varchar2(4000) not null,
board_writer varchar2(20) check(regexp_like(board_writer, '^[A-Za-z0-9]{8,20}$')),
board_readcount number default 0 not null check(board_readcount >= 0)
--unique (board_no)
);

insert into board(board_no, board_title, board_content, board_writer, board_readcount)
values(1, '입력한 제목', '입렵한 내용' , 'testuser2');

select * from board;

-- 번호의 경우 목적이 '식별'을 위한 값
-- [1] 번호가 변경될 수 있으면 NOT NULL UNIQUE로 본다
-- [2] 번호가 영원히 변경될 수 없다면 PRIMARY KEY로 본다
drop table board;
create table board(
board_no number primary key check(board_no > 0),
board_title varchar2(300) not null,
board_content varchar2(4000) not null,
board_writer varchar2(20) check(regexp_like(board_writer, '^[A-Za-z0-9]{8,20}$')),
board_readcount number default 0 not null check(board_readcount >= 0)
--unique (board_no)
);

/*
	결론
	- not null: null 금지 조건
	- unique: 중복 금지 조건(null 가능). 변화 가능하도록 설정
	- primary key: not + unique + 불변 (테이블 대표 항목). 변경 불가능하도록 설정
	- check: 데이터 형식 검사 조건
	- default: 미 지정 시 자동 설정될 값 조건
