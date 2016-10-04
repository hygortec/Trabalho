/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;


import br.com.ueg.model.Pais;
import br.com.ueg.repository.PaisRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ueg.services.PaisServices;

/**
 *
 * @author higor
 */
@Service
public class PaisServiesEmprementation implements PaisServices {

    @Autowired
    private PaisRepository repository;

    @Override
    public Pais findById(Long Id) {
        return repository.findOne(Id);
    }

    @Override
    public Collection<Pais> findAll() {
        return (Collection<Pais>) repository.findAll();
    }

    @Override
    public Pais create(Pais pais) {
        return repository.save(pais);
    }

    @Override
    public Pais update(Pais pais) {
        return repository.save(pais);
    }

    @Override
    public void delete(Pais pais) {
        repository.delete(pais);
    }
}
