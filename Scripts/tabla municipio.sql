CREATE TABLE municipio (
    id INT PRIMARY KEY,
    nombre VARCHAR(45),
    ciudad_id INT,
    FOREIGN KEY (ciudad_id) REFERENCES ciudad(id)
);

select * from municipio