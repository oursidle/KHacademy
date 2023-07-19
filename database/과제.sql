drop table book;
create table book(
book_id number primary key,
book_title varchar2(300) not null unique,
book_author varchar2(90) unique,
book_publication_date char(10) unique,
book_price number not null unique,
book_publisher varchar2(90) unique,
book_page_count number not null unique,
book_genre varchar2(27) not null unique,

check(regexp_like(book_publication_date, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(book_price >= 0 and book_price <= 9999999.99),
check(book_page_count >= 1),
);

drop sequence book_seq;
create sequence book_seq;

insert into book(
	book_id, book_title, book_author, book_publication_date, book, price,
	book_publisher, book_page, book_genre
) values(
	book_seq.nextval, 'Harry Potter 1', 'J.K. Rowling', '2001-06-26', 19.99,
	'Scholastic', 320, 'Fantasy');
	
