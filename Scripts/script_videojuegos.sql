-- crear tabla videojuegos
drop table videojuegos
create table videojuegos(
	codigo int not null,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int,
	constraint codigo_pk primary key(codigo)
)
insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(1, 'God of war', 'Aventura épica de un padre y su hijo en una misión de venganza.', 98), 
(2, 'Call of Duty', 'Juego de disparos ambientado en una intensa Guerra moderna.', 90), 
(3, 'Cyberpunk 2077', 'Mundo abierto futurista con elementos de rol y acción.', 85), 
(4, 'Dark Souls III', 'Juego de rol de acción con alta dificultad y un mundo de fantasía oscura.', 92), 
(5, 'Doom Eternal', 'Acción frenética contra hordas demoníacas. Una verdadera Guerra de un solo hombre.', 95), 
(6, 'Control', 'Aventura de acción sobrenatural con poderes telequinéticos.', 88), 
(7, 'Days Gone', 'Survival horror en un mundo post-apocalíptico lleno de freakers.', 80), 
(8, 'The Last of Us', 'Supervivencia emocional en un mundo devastado por una infeccion y una Guerra por recursos.', 97), 
(9, 'Dragon Age: Inquisition', 'Épico juego de rol y fantasía con toma de decisiones cruciales.', 89),
(10, 'Crash Bandicoot 4', 'Plataformas clásico con desafíos modernos y nuevas mecánicas.', 87); 

delete from videojuegos
select * from videojuegos