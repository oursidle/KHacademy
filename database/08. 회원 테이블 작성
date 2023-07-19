-- (주의) 오라클에는 긍정 혹은 부정 탐색이 없음

drop table member;
create table member(
member_id varchar2(25) primary key 
	check(regexp_like(member_id, '^[a-z][a-z0-9]{7,24}$')),
member_pw varchar2(20) not null
	check(
	regexp_like(member_pw, '[A-Z]+') 
	and
	regexp_like(member_pw, '[a-z]+')
	and
	regexp_like(member_pw, '[0-9]+')
	and
	regexp_like(member_pw, '[!@#$]+')
	and
	regexp_like(member_pw, '^[A-Za-z0-9!@#$]{8,20}$')
),
member_nickname varchar2(30) not null
	check(regexp_like(member_nickname, '^[A-Za-z0-9가-힣]{2,10}$')),
member_birth char(10) not null unique
	check(regexp_like(member_birth, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
member_email varchar2(100),
member_contact varchar2(11) not null
	check(regexp_like(member_contact, '^01[016789][1-9][0-9]{2,3}[0-9]{4}$')),
member_level varchar2(9) default '일반' not null
	check(member_level in('일반', 'VIP', '관리자')),
member_point number default 0 not null 
	check(member_point >= 0),
member_join date default sysdate not null
);

insert into member(member_id, member_pw, member_nickname,
	member_birth, member_email, member_contact)
	values('testuser1', 'Testuser1!', '테스트유저1', 
		'2023-07-19', null, '01012345678');
		
select * from member;
