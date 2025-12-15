CREATE TABLE huespedes (
    id INT PRIMARY KEY,
    nombres VARCHAR(45) NOT NULL,
    apellidos VARCHAR(45) NOT NULL,
    telefono CHAR(10),
    correo VARCHAR(45),
    direccon VARCHAR(45),
    ciudad VARCHAR(45),
    pais VARCHAR(45)
);

select * from huespedes