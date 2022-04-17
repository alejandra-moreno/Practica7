package com.practica7.practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.Value;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("DOCUMENTALES")

public class Documental {
    
    private @Column("ID") @Id String id;
	private @Column("NOMBRE") String nombre;
}
