CREATE TABLE question (
  id int(11) NOT NULL AUTO_INCREMENT,
  question varchar(200) NOT NULL,
  choice1 varchar(200) NOT NULL,
  choice2 varchar(200) NOT NULL,
  choice3 varchar(200) NOT NULL,
  choice4 varchar(200) NOT NULL,
  answer varchar(200) NOT NULL,
  question_type varchar(20) NOT NULL,
  PRIMARY KEY (id)
) ;