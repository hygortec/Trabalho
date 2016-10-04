package br.com.ueg.controller;


import br.com.ueg.model.Logradouro;
import br.com.ueg.model.Pais;
import br.com.ueg.services.LogradouroServices;
import br.com.ueg.services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/logradouro", produces = MediaType.APPLICATION_JSON_VALUE)
public class LogradouroController {
    @Autowired
    private LogradouroServices services;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Logradouro get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Logradouro post(Logradouro logradouro ){
        return services.create(logradouro);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Logradouro put(Logradouro logradouro){
        return services.update(logradouro);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Logradouro logradouro = services.findById(id);
        services.delete(logradouro);
    }
    
}
