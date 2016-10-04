package br.com.ueg.services;

import br.com.ueg.model.Estado;
import java.util.Collection;


public interface EstadoServices {    
    Estado findById(Long Id);
    Collection<Estado> findAll();
    Estado create(Estado estado);
    Estado update(Estado estado);    
    void delete(Estado estado);   
}
