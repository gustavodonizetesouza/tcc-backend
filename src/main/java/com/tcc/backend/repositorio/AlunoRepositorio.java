package com.tcc.backend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.backend.dominio.Aluno;

/* permite operacoes de acesso a dados  referentes ao objeto aluno */

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Integer>{
	
	Aluno findByEmail(String email);
}
