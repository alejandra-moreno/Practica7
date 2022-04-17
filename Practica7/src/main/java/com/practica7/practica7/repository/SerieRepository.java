package com.practica7.practica7.repository;

import com.practica7.practica7.model.Serie;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface SerieRepository extends CrudRepository<Serie,String> {
    @Query("SELECT * FROM SERIES WHERE SERIES.ID = :id")
    public Iterable <Serie> getSerieById(String id);

    @Query("DELETE FROM SERIES WHERE SERIES.SERIES = :id")
    public void deleteSerie(String id);
}
