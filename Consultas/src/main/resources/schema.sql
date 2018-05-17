drop table CATEGORIA if exists;
drop table PRODUCTO if exists;
drop sequence if exists hibernate_sequence;


create sequence hibernate_sequence 
start with 100 
increment by 1;

create table CATEGORIA 
(
	ID bigint not null, 
	NOMBRE varchar(255), 
	primary key (ID)
);

create table PRODUCTO 
(
	ID bigint not null, 
	DESCUENTO float, 
	NOMBRE varchar(255), 
	PVP float, 
	CATEGORIA_ID bigint, 
	primary key (ID)
);

alter table PRODUCTO 
add constraint FK_PRODUCTO_CATEGORIA 
foreign key (CATEGORIA_ID) references CATEGORIA;