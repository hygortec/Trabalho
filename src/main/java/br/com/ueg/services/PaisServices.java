package br.com.ueg.services;

import br.com.ueg.model.Pais;
import java.util.Collection;


public interface PaisServices {    
    Pais findById(Long Id);
    Collection<Pais> findAll();
    Pais create(Pais pais);
    Pais update(Pais pais);    
    void delete(Pais pais);   
}
