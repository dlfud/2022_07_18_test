DROP DATABASE IF EXISTS sbb2;
CREATE DATABASE sbb2;
USE sbb2;

CREATE TABLE Article (
    id INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    content TEXT NOT NULL,
    create_date DATETIME NOT NULL
);

INSERT INTO Article SET
create_date = NOW(),
title = '질문 1',
content = '질문내용 1';

INSERT INTO Article SET
create_date = NOW(),
title = '질문 2',
content = '질문내용 2';

INSERT INTO Article SET
create_date = NOW(),
title = '질문 3',
content = '질문내용 3';


CREATE TABLE Reply (
    id INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    content TEXT NOT NULL,
    create_date DATETIME NOT NULL,
    article_id INT(11) UNSIGNED NOT NULL
);

INSERT INTO Reply SET
create_date = NOW(),
content = '답변내용 1',
article_id = 1;

INSERT INTO Reply SET
create_date = NOW(),
content = '답변내용 2',
article_id = 2;

INSERT INTO Reply SET
create_date = NOW(),
content = '답변내용 3',
article_id = 3; 

SELECT * FROM Reply;