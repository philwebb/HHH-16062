DROP DATABASE IF EXISTS test_db;

CREATE DATABASE test_db;

USE test_db;

DROP TABLE IF EXISTS test_table;
CREATE TABLE test_table (
  id BIGINT NOT NULL AUTO_INCREMENT,
  description VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO test_table(description) values ('test_1');
INSERT INTO test_table(description) values ('test_2');
INSERT INTO test_table(description) values ('test_3');
