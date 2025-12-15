
create table usuario_grupo(
	id_user int not null,
	id_grup int not null,

	PRIMARY KEY (id_user, id_grup),
    FOREIGN KEY (id_user) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_grup) REFERENCES grupo(id_grupo)
)

select * from usuario_grupo