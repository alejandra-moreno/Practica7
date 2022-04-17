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

import com.practica7.practica7.model.Documental;
import com.practica7.practica7.repository.DocumentalRepository;

@RestController
@RequestMapping("/api/v1")
@Service
public class DocumentalController {
    @Autowired
    private DocumentalRepository documentalRepository;

    @GetMapping("/documental")
    public ResponseEntity<Iterable<Documental>> getDocumental(){

       Iterable<Documental> response = documentalRepository.findAll();
       return ResponseEntity.ok().body(response);
    }

    @PutMapping("/documental/{id}/")
    public ResponseEntity<Documental> updateDocumental(@PathVariable String id, @RequestBody Documental documental) {
        Documental newDocumental = documentalRepository.save(documental);
        if (newDocumental == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newDocumental);
    }

    @DeleteMapping("/documental/{id}")
    public ResponseEntity<Documental> deleteDocumental(@PathVariable String id) {
        documentalRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
