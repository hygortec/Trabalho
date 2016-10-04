package br.com.ueg.services;

import br.com.ueg.model.Bairro;
import java.util.Collection;


public interface BairroServices {    
    Bairro findById(Long Id);
    Collection<Bairro> findAll();
    Bairro create(Bairro bairro);
    Bairro update(Bairro bairro);    
    void delete(Bairro bairro);   
}
