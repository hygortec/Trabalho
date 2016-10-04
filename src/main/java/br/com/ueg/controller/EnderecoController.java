package br.com.ueg.controller;


import br.com.ueg.model.Endereco;
import br.com.ueg.services.EnderecoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/endereco", produces = MediaType.APPLICATION_JSON_VALUE)
public class EnderecoController {
    @Autowired
    private EnderecoServices services;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Endereco get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Endereco post(Endereco endereco ){
        return services.create(endereco);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Endereco put(Endereco endereco){
        return services.update(endereco);
    }    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Endereco endereco = services.findById(id);
        services.delete(endereco);
    }
    
}
