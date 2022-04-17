package com.practica7.practica7.service;

import com.practica7.practica7.model.Serie;

public interface SerieService {
    Iterable<Serie> getSerie();
    void deleteSerie(String id);
    Serie updateSerie(String id, Serie song);
}
