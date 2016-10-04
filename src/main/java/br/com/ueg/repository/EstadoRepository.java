package br.com.ueg.repository;

import br.com.ueg.model.Estado;
import br.com.ueg.model.Pais;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long>{
    Estado findByNome(String nome);
}
