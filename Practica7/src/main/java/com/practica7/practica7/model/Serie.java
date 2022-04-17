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
@Table("SERIES")

public class Serie {
    private @Column("ID") @Id String id;
	private @Column("NOMBRE") String nombre;
	private @Column("TEMPORADAS") String temporadas;
	private @Column("FECHA_ESTRENO") LocalDate fecha;
	private @Column("CAPITULOS") String capitulos;
	private @Column("GENERO") String genero;
}
