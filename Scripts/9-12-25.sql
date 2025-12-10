select * from personas

delete from personas

alter table personas
add column estado_civil_codigo char(1) not null

create table estado_civil (
	codigo char(1) not null,
	descripcion varchar(20) not null,
	constraint estado_civil_pk primary key (codigo)
)

foreign key (estado_civil)){

}