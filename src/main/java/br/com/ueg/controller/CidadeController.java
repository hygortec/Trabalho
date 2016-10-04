package br.com.ueg.controller;


import br.com.ueg.model.Cidade;
import br.com.ueg.model.Pais;
import br.com.ueg.services.CidadeServices;
import br.com.ueg.services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/cidade", produces = MediaType.APPLICATION_JSON_VALUE)
public class CidadeController {
    @Autowired
    private CidadeServices services;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cidade get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Cidade post(Cidade cidade ){
        return services.create(cidade);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Cidade put(Cidade cidade){
        return services.update(cidade);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Cidade cidade = services.findById(id);
        services.delete(cidade);
    }
    
}
