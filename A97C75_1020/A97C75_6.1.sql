CREATE TABLE gyarto (
    adoszam INT PRIMARY KEY,
    nev VARCHAR(30) NOT NULL,
    telephely VARCHAR(200)
);
CREATE TABLE termek (
    tkod INT PRIMARY KEY,
    nev VARCHAR(50) NOT NULL,
    ear INT CHECK (EAR > 0),
    gyarto INT REFERENCES GYARTO
);