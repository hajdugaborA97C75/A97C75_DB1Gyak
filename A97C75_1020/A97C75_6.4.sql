CREATE TABLE termekek (
    tkod INT PRIMARY KEY,
    nev VARCHAR(50) NOT NULL,
    ear INT CHECK (EAR > 0),
    kategoria CHAR(20)
);
INSERT INTO termekek VALUES (1,’ásó’, 1200,’K1’);
INSERT INTO termekek VALUES (2,’csákány’, 2300,’K1’);
INSERT INTO termekek VALUES (3,’balta’, 2500,’K2’);
INSERT INTO termekek VALUES (4,’fejsze’, 500,’K3’);
INSERT INTO termekek VALUES (5,’véső’, 1400,’K4’);