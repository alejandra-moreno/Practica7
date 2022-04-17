package com.practica7.practica7.service;

import com.practica7.practica7.model.Documental;

public interface DocumentalService {
    Iterable<Documental> getDocumental();
    void deleteDocumental(String id);
    Documental updateDocumental(String id, Documental documental);
}
