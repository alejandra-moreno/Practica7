package com.practica7.practica7.repository;

import com.practica7.practica7.model.*;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface DocumentalRepository extends CrudRepository<Documental, String>{
    @Query("SELECT * FROM DOCUMENTALES WHERE DOCUMENTALES.ID = :id")
    public Iterable <Documental> getDocumentalById(String id);

    @Query("INSERT INTO DOCUMENTALES (DOCUMENTALES.ID, DOCUMENTALES.NOMBRE) VALUES (id,nombre)")
    public void insertDocumental(String id,String nombre);

    @Query("DELETE FROM DOCUMENTAL WHERE DOCUMENTALES.ID = :id")
    public void deleteDocumental(String artistId);
}
