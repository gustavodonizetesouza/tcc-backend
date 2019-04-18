package com.tcc.backend.servicos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tcc.backend.dominio.Aluno;
import com.tcc.backend.repositorio.AlunoRepositorio;

@Service
public class BancoDeDadosServico {
	
	@Autowired
	private AlunoRepositorio alunoRepo;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public void instanciarBancoDeDadosTeste() {
		Aluno a1 = new Aluno(11, "Professor", "PUCMinas", "Belo Horizonte", "MG", "(31)3319-4444", "professor@pucminas.com", pe.encode("123"));
		Aluno a2 = new Aluno(23, "Gustavo", "TCC", "Belo Horizonte", "MG", null, "g@g.com", pe.encode("g"));
		
		alunoRepo.save(Arrays.asList(a1, a2));
	}

}
