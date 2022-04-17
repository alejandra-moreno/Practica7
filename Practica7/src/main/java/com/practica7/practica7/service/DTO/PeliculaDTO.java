package com.practica7.practica7.service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PeliculaDTO {
    String id;
    String nombre;
    String director;
    String fecha_estreno;
    String genero;
}
