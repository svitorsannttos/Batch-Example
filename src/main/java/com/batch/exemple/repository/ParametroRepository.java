package com.batch.exemple.repository;

import com.batch.exemple.domain.model.Parametro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametroRepository extends JpaRepository<Parametro, Long> {

    Parametro findByValor(String valor);

}
