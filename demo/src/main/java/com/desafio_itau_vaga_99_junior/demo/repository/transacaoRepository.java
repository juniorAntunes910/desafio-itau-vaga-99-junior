package com.desafio_itau_vaga_99_junior.demo.repository;

import com.desafio_itau_vaga_99_junior.demo.Entity.transacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface transacaoRepository extends JpaRepository<transacaoEntity, Long> {

}
