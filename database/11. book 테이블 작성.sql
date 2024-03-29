drop table book;
create table book(
book_id number primary key,
book_title varchar2(300) not null,
book_author varchar2(90),
book_publication_date char(10),
book_price number(*,2) not null,-- '*' 무관
book_publisher varchar2(90),
book_page_count number not null,
book_genre varchar2(30) not null,

check(regexp_like(book_author, '[^!@#$]+')),
check(regexp_like(book_publication_date, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(book_price >= 0),
check(book_page_count > 0)
);

drop sequence book_seq;
create sequence book_seq;

-- 1
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'Harry Potter 1', 'J.K. Rowling', '2001-06-26', 19.99,
	'Scholastic', 320, 'Fantasy');
-- 2
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 14.99,
	'Grand Central Publishing', 336, 'Classic');
-- 3
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 12.99,
	'Scribner', 180, 'Classic');
-- 4
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, '1984', 'George Orwell', '1949-06-08', 10.99,
	'Secker & Warburg', 328, 'Dystopian');
-- 5 : 연도 오류(1813)
/*insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'Pride and Prejudice', 'Jane Austen', '1813-01-28', 9.99,
	'Penguin Classics', 432, 'Romance');*/
-- 6
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'The Hobbit', 'J.R.R. Tolkien', '1937-09-21', 15.99,
	'Houghton Mifflin Harcourt', 320, 'Fantasy');
-- 7
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'The Catcher in the Rye', 'J.D. Salinger', '1951-07-16', 11.99,
	'Little, Brown and Company', 224, 'Classic');
-- 8
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'Lord of the Rings', 'J.R.R. Tolkien', '1954-07-29', 29.99,
	'Allen & Unwin', 320, 'Fantasy');
-- 9
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'To the Lighthouse', 'Virginia Woolf', '1927-05-05', 13.99,
	'Harcourt, Brace and Company', 209, 'Modernist');
-- 10
insert into book(
	book_id, book_title, book_author, book_publication_date, book_price,
	book_publisher, book_page_count, book_genre
) values(
	book_seq.nextval, 'The Alchemist', 'Paulo Coelho', '1988-06-01', 9.99,
	'HarperOne', 208, 'Fiction');

select * from book;
select * from book_seq;
