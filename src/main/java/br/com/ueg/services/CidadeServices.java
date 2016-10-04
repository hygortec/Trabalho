package br.com.ueg.services;

import br.com.ueg.model.Cidade;
import java.util.Collection;


public interface CidadeServices {    
    Cidade findById(Long Id);
    Collection<Cidade> findAll();
    Cidade create(Cidade cidade);
    Cidade update(Cidade cidade);    
    void delete(Cidade cidade);   
}
