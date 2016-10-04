package br.com.ueg.services;

import br.com.ueg.model.Logradouro;
import java.util.Collection;


public interface LogradouroServices {    
    Logradouro findById(Long Id);
    Collection<Logradouro> findAll();
    Logradouro create(Logradouro logradouro);
    Logradouro update(Logradouro logradouro);    
    void delete(Logradouro logradouro);   
}
