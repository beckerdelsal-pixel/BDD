CREATE TABLE reservas (
    inicio_fecha DATE,
    fin_fecha DATE,
	habitacion INT NOT NULL,
    huesped_id INT NOT NULL,
    PRIMARY KEY (habitacion, huesped_id), 
    FOREIGN KEY (habitacion) REFERENCES habitaciones(habitacion_numero),
    FOREIGN KEY (huesped_id) REFERENCES huespedes(id)
);

select * from reservas
