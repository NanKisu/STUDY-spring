CREATE TABLE Noun001 (
	sys_c VARCHAR(3) NOT NULL,
	id INT(11) NOT NULL AUTO_INCREMENT,
	value VARCHAR(20) NOT NULL,
	PRIMARY KEY (sys_c, id),
	UNIQUE INDEX id (id)
);