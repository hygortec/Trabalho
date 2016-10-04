/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;


import br.com.ueg.model.Logradouro;
import br.com.ueg.model.Pais;
import br.com.ueg.repository.LogradouroRepository;
import br.com.ueg.repository.PaisRepository;
import br.com.ueg.services.LogradouroServices;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ueg.services.PaisServices;

/**
 *
 * @author higor
 */
@Service
public class LogradouroServiesEmprementation implements LogradouroServices {

    @Autowired
    private LogradouroRepository repository;

    @Override
    public Logradouro findById(Long Id) {
        return repository.findOne(Id);
    }

    @Override
    public Collection<Logradouro> findAll() {
        return (Collection<Logradouro>) repository.findAll();
    }

    @Override
    public Logradouro create(Logradouro logradouro) {
        return repository.save(logradouro);
    }

    @Override
    public Logradouro update(Logradouro logradouro) {
        return repository.save(logradouro);
    }

    @Override
    public void delete(Logradouro logradouro) {
        repository.delete(logradouro);
    }
}
