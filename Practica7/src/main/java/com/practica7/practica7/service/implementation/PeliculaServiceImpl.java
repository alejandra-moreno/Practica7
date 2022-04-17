package com.practica7.practica7.service.implementation;

import com.practica7.practica7.model.Pelicula;
import com.practica7.practica7.repository.PeliculaRepository;
import com.practica7.practica7.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;
    @Override
    public Iterable<Pelicula> getPelicula(){
        return peliculaRepository.findAll();
    }

    @Override
    public void deletePelicula(String id) {
        peliculaRepository.deleteById(id);
        
    }

    @Override
    public Pelicula updatePelicula(String id, Pelicula pelicula) {
        if(peliculaRepository.existsById(id)){
            return peliculaRepository.save(pelicula);
        }else{
            return null;
        }
    }
}
