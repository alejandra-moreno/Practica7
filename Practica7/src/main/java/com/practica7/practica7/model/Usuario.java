package com.practica7.practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("USUARIOS")

public class Usuario {
    private @Column("DNI") @Id String dni;
	private @Column("NOMBRE") String nombre;
	private @Column("CONTRASENA") String password;
	private @Column("EMAIL") String email;
}
