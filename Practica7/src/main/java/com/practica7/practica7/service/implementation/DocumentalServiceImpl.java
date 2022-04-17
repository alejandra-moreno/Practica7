package com.practica7.practica7.service.implementation;

import com.practica7.practica7.model.Documental;
import com.practica7.practica7.repository.DocumentalRepository;
import com.practica7.practica7.service.DocumentalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentalServiceImpl implements DocumentalService{
    
    @Autowired
    private DocumentalRepository documentalRepository;
    @Override
    public Iterable<Documental> getDocumental(){
        return documentalRepository.findAll();
    }

    @Override
    public void deleteDocumental(String id){
        documentalRepository.deleteById(id);
        
    }

    @Override
    public Documental updateDocumental(String id, Documental documental){
        if(documentalRepository.existsById(id)){
            return documentalRepository.save(documental);
        }else{
            return null;
        }
    }
}
