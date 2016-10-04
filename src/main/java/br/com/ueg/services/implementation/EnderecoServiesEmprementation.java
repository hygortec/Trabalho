/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;

import br.com.ueg.model.Endereco;

import br.com.ueg.repository.EnderecoRepository;

import br.com.ueg.services.EnderecoServices;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author higor
 */
@Service
public class EnderecoServiesEmprementation implements EnderecoServices {

    @Autowired
    private EnderecoRepository repository;

    @Override
    public Endereco findById(Long Id) {
        return repository.findOne(Id);
    }

    @Override
    public Collection<Endereco> findAll() {
        return (Collection<Endereco>) repository.findAll();
    }

    @Override
    public Endereco create(Endereco endereco) {
        return repository.save(endereco);
    }

    @Override
    public Endereco update(Endereco endereco) {
        return repository.save(endereco);
    }

    @Override
    public void delete(Endereco endereco) {
        repository.delete(endereco);
    }
}
