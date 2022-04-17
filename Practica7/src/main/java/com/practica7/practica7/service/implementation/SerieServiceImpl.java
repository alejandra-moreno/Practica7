package com.practica7.practica7.service.implementation;

import com.practica7.practica7.model.Serie;
import com.practica7.practica7.repository.SerieRepository;
import com.practica7.practica7.service.SerieService;

import org.springframework.beans.factory.annotation.Autowired;

public class SerieServiceImpl implements SerieService{

    @Autowired
    private SerieRepository serieRepository;

    @Override
    public Iterable<Serie> getSerie(){
        return serieRepository.findAll();
    }

    @Override
    public void deleteSerie(String id){
        serieRepository.deleteById(id);
    }

    @Override
    public Serie updateSerie(String id, Serie serie){
        if(serieRepository.existsById(id)){
            return serieRepository.save(serie);
        }else{
            return null;
        }
    }
}
