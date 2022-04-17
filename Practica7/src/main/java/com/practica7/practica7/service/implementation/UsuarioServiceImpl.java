package com.practica7.practica7.service.implementation;

import com.practica7.practica7.model.Usuario;
import com.practica7.practica7.repository.UserRepository;
import com.practica7.practica7.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<Usuario> getUser(){
        return userRepository.findAll();
    }
    @Override
    public void deleteUser(String id){
        userRepository.deleteById(id);
        
    }
    @Override
    public Usuario updateAlbum(String id, Usuario user){
        if(userRepository.existsById(id)){
            return userRepository.save(user);
        }else{
            return null;
        }
    }
    
    
}
