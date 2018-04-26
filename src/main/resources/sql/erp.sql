CREATE TABLE IF NOT EXISTS orderTable (
  orderNo      VARCHAR(100) PRIMARY KEY NOT NULL,
  customer     VARCHAR(10)         NOT NULL,
  date         DATE,
  countOfCloth DOUBLE(5, 1),
  weight       VARCHAR(10),
  uncompleted  DOUBLE(5, 1),
  remarkOfType VARCHAR(100)
)
  CHARSET = utf8;

CREATE TABLE IF NOT EXISTS Tasktable (
  taskNo             VARCHAR(20) PRIMARY KEY NOT NULL,
  orderNo            VARCHAR(20)             NOT NULL,
  workblankNo        VARCHAR(10),
  dateOfProduce      DATE,
  colorName          VARCHAR(10),
  colorNo            VARCHAR(10),
  deadLine           VARCHAR(20),
  type               VARCHAR(10),
  weightPerCloth     VARCHAR(10),
  mouse              VARCHAR(10),
  countOfClothOfTask VARCHAR(10),
  weightOfTask       VARCHAR(10),
  weightPerDoor      VARCHAR(10),
  dyeType            VARCHAR(10),
  lightSource        VARCHAR(10),
  LightFace          VARCHAR(10),
  PH                 DOUBLE(2, 1),
  deoil              VARCHAR(10),
  fixation           VARCHAR(10),
  polish             VARCHAR(10),
  aberration         VARCHAR(10),
  detection          VARCHAR(10),
  fastness           VARCHAR(10),
  application        VARCHAR(10),
  slice              VARCHAR(10),
  function           VARCHAR(10),
  remark             VARCHAR(1000),
  process            BLOB,
  curState           VARCHAR(10),
  nextState          VARCHAR(10)
)
  CHARSET = utf8;


use erp;
DROP table if EXISTS userinfo;

CREATE TABLE userinfo (
  user_id BIGINT(32)  NOT NULL AUTO_INCREMENT ,
  user_phoneNo  VARCHAR(11) NOT NULL,
  user_name     VARCHAR(9)  NOT NULL,
  user_password VARCHAR(10) NOT NULL,
  PRIMARY KEY (user_id)
)ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;