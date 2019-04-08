package com.tcc.backend.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.backend.dominio.Aluno;
import com.tcc.backend.repositorio.AlunoRepositorio;

@Service
public class AlunoServico {
	
	// m�todo que busca um aluno por c�digo
	@Autowired
	private AlunoRepositorio repo;
	
	public Aluno buscar(Integer cpf) {
		Aluno obj = repo.findOne(cpf);
		return obj;
		
	}
	
	
}
