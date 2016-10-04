package br.com.ueg.repository;

import br.com.ueg.model.Cidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Long>{
    Cidade findByNome(String nome);
}
