package com.practica7.practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("PELICULAS")

public class Pelicula {
    private @Column("ID") @Id String id;
	private @Column("NOMBRE") String nombre;
	private @Column("DIRECTOR") String director;
	private @Column("FECHA_ESTRENO") LocalDate fecha;
	private @Column("GENERO") String genero;
}
