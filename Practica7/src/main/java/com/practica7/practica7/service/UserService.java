package com.practica7.practica7.service;

import com.practica7.practica7.model.Usuario;

public interface UserService {
    
    Iterable<Usuario> getUser();
    void deleteUser(String idUser);
    Usuario updateAlbum(String id, Usuario user);
}
