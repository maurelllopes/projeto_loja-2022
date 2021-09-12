package com.maurelllopes.projeto_loja2002.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurelllopes.projeto_loja2002.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}

