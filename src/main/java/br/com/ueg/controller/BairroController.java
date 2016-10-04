package br.com.ueg.controller;


import br.com.ueg.model.Bairro;
import br.com.ueg.model.Pais;
import br.com.ueg.services.BairroServices;
import br.com.ueg.services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/bairro", produces = MediaType.APPLICATION_JSON_VALUE)
public class BairroController {
    @Autowired
    private BairroServices services;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Bairro get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Bairro post(Bairro bairro ){
        return services.create(bairro);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Bairro put(Bairro bairro){
        return services.update(bairro);
    }    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Bairro bairro = services.findById(id);
        services.delete(bairro);
    }
    
}
