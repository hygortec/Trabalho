package br.com.ueg.controller;


import br.com.ueg.model.Estado;
import br.com.ueg.model.Pais;
import br.com.ueg.services.EstadoServices;
import br.com.ueg.services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/estado", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstadoController {
    @Autowired
    private EstadoServices services;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Estado get(@PathVariable(value = "id") Long id){
       return  services.findById(id);
    }
    
    @RequestMapping( method = RequestMethod.POST)
    public Estado post(Estado estado ){
        return services.create(estado);
    }
     
    @RequestMapping(method = RequestMethod.PUT)
    public Estado put(Estado estado){
        return services.update(estado);
    }
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        Estado  estado = services.findById(id);
        services.delete(estado);
    }
    
}
