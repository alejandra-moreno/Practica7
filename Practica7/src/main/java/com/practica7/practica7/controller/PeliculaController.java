package com.practica7.practica7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica7.practica7.model.Pelicula;
import com.practica7.practica7.repository.PeliculaRepository;

@RestController
@RequestMapping("/api/v1")
@Service
public class PeliculaController {
    @Autowired
    private PeliculaRepository peliculaRepository;

    @GetMapping("/pelicula")
    public ResponseEntity<Iterable<Pelicula>> getPelicula(){

       Iterable<Pelicula> response = peliculaRepository.findAll();
       return ResponseEntity.ok().body(response);
    }


    @PutMapping("/pelicula/{id}/")
    public ResponseEntity<Pelicula> updateAlbum(@PathVariable String id, @RequestBody Pelicula pelicula) {
        Pelicula newPelicula = peliculaRepository.save(pelicula);
        if (newPelicula == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newPelicula);
    }

    @DeleteMapping("/pelicula/{id}")
    public ResponseEntity<Pelicula> deletePelicula(@PathVariable String id) {
        peliculaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
