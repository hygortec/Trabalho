/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;


import br.com.ueg.model.Cidade;
import br.com.ueg.model.Pais;
import br.com.ueg.repository.CidadeRepository;
import br.com.ueg.repository.PaisRepository;
import br.com.ueg.services.CidadeServices;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ueg.services.PaisServices;

/**
 *
 * @author higor
 */
@Service
public class CidadeServiesEmprementation implements CidadeServices {

    @Autowired
    private CidadeRepository repository;

    @Override
    public Cidade findById(Long Id) {
        return repository.findOne(Id);
    }

    @Override
    public Collection<Cidade> findAll() {
        return (Collection<Cidade>) repository.findAll();
    }

    @Override
    public Cidade create(Cidade cidade) {
        return repository.save(cidade);
    }

    @Override
    public Cidade update(Cidade cidade) {
        return repository.save(cidade);
    }

    @Override
    public void delete(Cidade cidade) {
        repository.delete(cidade);
    }
}
