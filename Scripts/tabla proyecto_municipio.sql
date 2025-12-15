CREATE TABLE proyecto_municipio (
	proyecto_id INT NOT NULL,
    municipio_id INT NOT NULL,
    
    PRIMARY KEY (proyecto_id, municipio_id), -- Llave compuesta
    FOREIGN KEY (municipio_id) REFERENCES municipio(id),
    FOREIGN KEY (proyecto_id) REFERENCES proyecto(id)
);

select * from proyecto_municipio
