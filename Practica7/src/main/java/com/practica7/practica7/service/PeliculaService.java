package com.practica7.practica7.service;

import com.practica7.practica7.model.Pelicula;

public interface PeliculaService {
    Iterable<Pelicula> getPelicula();
    void deletePelicula(String id);
    Pelicula updatePelicula(String id, Pelicula pelicula);
}
