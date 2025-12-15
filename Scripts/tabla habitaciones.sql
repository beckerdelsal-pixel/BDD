CREATE TABLE habitaciones (
    habitacion_numero INT PRIMARY KEY,
    precio_por_noche DECIMAL(10, 2) NOT NULL,
    piso INT NOT NULL,
    max_personas INT
);

select * from  habitaciones