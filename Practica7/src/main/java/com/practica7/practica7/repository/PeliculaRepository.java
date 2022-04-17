package com.practica7.practica7.repository;

import com.practica7.practica7.model.Pelicula;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepository extends CrudRepository<Pelicula,String>{
    @Query("SELECT * FROM PELICULAS WHERE PELICULAS.ID = :id")
    public Iterable <Pelicula> getPeliculaById(String id);

    @Query("DELETE FROM PELICULAS WHERE PELICULAS.ID = :id")
    public void deletePelicula(String id);

}
