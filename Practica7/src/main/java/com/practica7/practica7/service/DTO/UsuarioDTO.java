package com.practica7.practica7.service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO {
    String dni;
    String nombre;
    String contrasena;
    String email;
}
