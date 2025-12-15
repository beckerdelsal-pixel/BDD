CREATE TABLE proyecto (
    id INT PRIMARY KEY,
    proyecto VARCHAR(50) NOT NULL,
    monto DECIMAL(15, 2) NOT NULL, -- Usando DECIMAL para el tipo MONEY
    fecha_inicio DATE,
    fecha_entrega DATE
);

select * from proyecto