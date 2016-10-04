package br.com.ueg.repository;

import br.com.ueg.model.Pais;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Long>{
    Pais findByNome(String nome);
}
