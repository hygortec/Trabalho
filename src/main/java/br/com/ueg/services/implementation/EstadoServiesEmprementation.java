/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;


import br.com.ueg.model.Estado;
import br.com.ueg.model.Pais;
import br.com.ueg.repository.EstadoRepository;
import br.com.ueg.repository.PaisRepository;
import br.com.ueg.services.EstadoServices;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ueg.services.PaisServices;

/**
 *
 * @author higor
 */
@Service
public class EstadoServiesEmprementation implements EstadoServices {

    @Autowired
    private EstadoRepository repository;

    @Override
    public Estado findById(Long Id) {
        return repository.findOne(Id);
    }

    @Override
    public Collection<Estado> findAll() {
        return (Collection<Estado>) repository.findAll();
    }

    @Override
    public Estado create(Estado estado) {
        return repository.save(estado);
    }

    @Override
    public Estado update(Estado estado) {
        return repository.save(estado);
    }

    @Override
    public void delete(Estado estado) {
        repository.delete(estado);
    }
}
