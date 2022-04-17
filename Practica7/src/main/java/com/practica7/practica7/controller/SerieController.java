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


import com.practica7.practica7.model.Serie;
import com.practica7.practica7.repository.SerieRepository;

@RestController
@RequestMapping("/api/v1")
@Service
public class SerieController {
    @Autowired
    private SerieRepository serieRepository;

    @GetMapping("/serie")
    public ResponseEntity<Iterable<Serie>> getSerie(){

       Iterable<Serie> response = serieRepository.findAll();
       return ResponseEntity.ok().body(response);
    }


    @PutMapping("/serie/{id}/")
    public ResponseEntity<Serie> updateSerie(@PathVariable String id, @RequestBody Serie serie) {
        Serie newSerie = serieRepository.save(serie);
        if (newSerie == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newSerie);
    }

    @DeleteMapping("/serie/{id}")
    public ResponseEntity<Serie> deleteSerie(@PathVariable String id) {
        serieRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }  
}
