# demo-mybatis

Para ejecutar la demo es necesario crear una base de datos que se llame "demo" en postgres y en ella crear la siguiente tabla:

CREATE TABLE public.users (
	id int8 NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT usuario_pk PRIMARY KEY (id)
);

También hay que crear una secuencia de base de datos para ejecutar la demo:

CREATE SEQUENCE public.user_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;


 El usuario de la base de datos es postgres y la contraseña es 123123



 Para invocar a los servicios creados en la demo están los siguientes 3 comandos CURL:

 Create Use:
 curl --location 'http://localhost:8080/demo/create-user' \
--header 'Content-Type: application/json' \
--data '{
    "id": null,
    "name":"Francis"
}'

Update User:
curl --location --request PUT 'http://localhost:8080/demo/update-user' \
--header 'Content-Type: application/json' \
--data '{
    "id": 9,
    "name":"Carlos"
}'

List Users:
curl --location 'http://localhost:8080/demo/list-users'


