package br.com.ueg.services;

import br.com.ueg.model.Endereco;
import java.util.Collection;


public interface EnderecoServices {    
    Endereco findById(Long Id);
    Collection<Endereco> findAll();
    Endereco create(Endereco endereco);
    Endereco update(Endereco endereco);    
    void delete(Endereco endereco);   
}
