CREATE TABLE IF NOT EXISTS orderTable (
  orderNo      INT(10) PRIMARY KEY NOT NULL,
  customer     VARCHAR(10)         NOT NULL,
  date         DATE,
  countOfCloth DOUBLE(3, 2),
  weight       VARCHAR(10),
  remarkOfType VARCHAR(100)
)
  CHARSET = utf8;

CREATE TABLE IF NOT EXISTS CompletedTable (
  taskNo             INT(10) PRIMARY KEY NOT NULL,
  orderNo            INT(10)             NOT NULL,
  FOREIGN KEY (orderNo) REFERENCES orderTable (orderNo),
  workblankNo        VARCHAR(9),
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
  remark             VARCHAR(100),
  process            VARCHAR(100),
  curState           VARCHAR(10),
  nextState          VARCHAR(10)
)
  CHARSET = utf8;


CREATE TABLE IF NOT EXISTS UncompletedTable (
  taskNo             INT(10) PRIMARY KEY NOT NULL,
  orderNo            INT(10)             NOT NULL,
  FOREIGN KEY (orderNo) REFERENCES orderTable (orderNo),
  workblankNo        VARCHAR(9),
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
  remark             VARCHAR(100),
  process            VARCHAR(100),
  curState           VARCHAR(10),
  nextState          VARCHAR(10)
)
  CHARSET = utf8;


CREATE TABLE userInfo (
  phoneNo  INT(11)     NOT NULL PRIMARY KEY,
  name     VARCHAR(4)  NOT NULL,
  password VARCHAR(10) NOT NULL
)
  CHARSET = utf8;