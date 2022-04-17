# Práctica 7: Persistencia con Queries

## Objetivo de la práctica

El objetivo de esta séptima práctica de la asignatura es aplicar los conocimientos adquiridos en clase para desarrollar una app de Spring Boot que permita persistir información  en una base de datos H2 utilizando la librería Spring Data JDBC. 

En la carpeta resources/db se encuentra el archivo *schema.sql* donde se han definido las distintas tablas de la base de datos. La temática elegida es entretenimiento, de modo que tenemos una tabla para guardar usuarios y 3 tablas para series, películas y documentales. En esa misma carpeta, en el archivo *data.sql* se ha realizado un insert en cada tabla para que éstas no estuviesen vacías.

El módulo de persistencia debe incluir las operaciones (INSERT, UPDATE, SELECT y DELETE). Dentro de la carpeta controller se encuentran los controladores con las funciones que permiten manejar los datos almacenados en la base de datos mediante el id. Los archivos en la carpeta model funcionan como puente entre java y sql, mientras que los de la carpeta repository permiten ejecutar las denominadas operaciones CRUD (Create, Read, Update y Delete). Finalmente, en la carpeta service se ha desarrollado la persistencia de datos de modo que por un lado están los archivos DTO y por otro las implementaciones.

https://alejandramoreno-practica-71ap8ywff76.ws-eu40.gitpod.io/

## Referencias

- https://spring.io/projects/spring-data-jdbc
- README editado con: https://stackedit.io/
