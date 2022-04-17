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

import com.practica7.practica7.model.Usuario;
import com.practica7.practica7.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")

@Service
public class UsuarioController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public ResponseEntity<Iterable<Usuario>> getUser(){

       Iterable<Usuario> response = userRepository.findAll();
       return ResponseEntity.ok().body(response);
    }

    @PutMapping("/users/{id}/")
    public ResponseEntity<Usuario> updateUser(@PathVariable String id, @RequestBody Usuario user) {
        Usuario newUser = userRepository.save(user);
        if (newUser == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Usuario> deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
