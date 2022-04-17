package com.practica7.practica7.service.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SerieDTO {
    String id;
    String nombre;
    String temporadas;
    LocalDate fecha_estreno;
    String capitulos;
    String genero;
}
