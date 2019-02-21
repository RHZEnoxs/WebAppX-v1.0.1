# tbuser
DROP TABLE IF EXISTS tb_ch12_user

CREATE TABLE tb_ch12_user(
id INT PRIMARY KEY AUTO_INCREMENT,      #id
loginname VARCHAR(50) UNIQUE,		#登錄名 郵箱
PASSWORD VARCHAR(18),			#密碼
username VARCHAR(18),			#用戶名
phone VARCHAR(18),			#電話
address VARCHAR(255)			#地址
);

INSERT INTO tb_ch12_user (loginname, PASSWORD, username, phone, address)
VALUES ('jack' ,'123456','捷克','111223344567890','台灣');


DROP TABLE IF EXISTS tb_ch12_book;
CREATE TABLE tb_ch12_book (
	id INT (11) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR (54),
	author VARCHAR (54),
	publicationdate DATE ,
	publication VARCHAR (150),
	price DOUBLE ,
	image VARCHAR (54),
	remark VARCHAR (600)
);

INSERT INTO tb_ch12_book (id, name, author, publicationdate, publication, price, image, remark) VALUES
('1','瘋狂JAVA#1','李崗#1','2018-01-01','出版社#1','75.2','java.jpg','Remark#1');
INSERT INTO tb_ch12_book (id, name, author, publicationdate, publication, price, image, remark) VALUES
('2','瘋狂JAVA#2','李崗#2','2018-01-01','出版社#2','75.2','ee.jpg','Remark#2');
INSERT INTO tb_ch12_book (id, name, author, publicationdate, publication, price, image, remark) VALUES
('3','瘋狂JAVA#3','李崗#3','2018-01-01','出版社#3','75.3','android.jpg','Remark#3');
INSERT INTO tb_ch12_book (id, name, author, publicationdate, publication, price, image, remark) VALUES
('4','瘋狂JAVA#4','李崗#4','2018-01-01','出版社#4','75.4','ajax.jpg','Remark#4');
INSERT INTO tb_ch12_book (id, name, author, publicationdate, publication, price, image, remark) VALUES
('5','瘋狂JAVA#5','李崗#5','2018-01-01','出版社#5','75.5','java.jpg','Remark#5');


