package br.com.ueg.repository;

import br.com.ueg.model.Endereco;
import br.com.ueg.model.Pais;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{
    Endereco findByNumero(String Numero);
}
