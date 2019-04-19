package com.tcc.backend.servicos;

import com.tcc.backend.dominio.Aluno;
import com.tcc.backend.repositorio.AlunoRepositorio;
import com.tcc.backend.seguranca.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AlunoServico {

	// metodo que busca um aluno por c�digo
	@Autowired
	private AlunoRepositorio repo;

	public Aluno buscar(Integer cpf) {
		Aluno obj = repo.findOne(cpf);
		return obj;

	}

	public static Usuario authenticated() {
		try {
			return (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}

}
