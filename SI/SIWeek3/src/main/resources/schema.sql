Drop TABLE IF EXISTS STUDENT;

CREATE TABLE STUDENT
(
    sid LONG AUTO_INCREMENT primary key,
    sname varchar(25) NOT NULL,
    smail VARCHAR(25) NOT NULL
);