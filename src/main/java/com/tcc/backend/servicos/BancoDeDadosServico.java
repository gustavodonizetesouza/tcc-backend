package com.tcc.backend.servicos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.backend.dominio.Aluno;
import com.tcc.backend.repositorio.AlunoRepositorio;

@Service
public class BancoDeDadosServico {
	
	@Autowired
	private AlunoRepositorio alunoRepo;
	
	public void instanciarBancoDeDadosTeste() {
		Aluno a1 = new Aluno(11, "Matheus", "Rua Severino", "Uni�o da Vit�ria", "PR", "(42)99953-6507", "matheus7@gmail.com", "123");
		Aluno a2 = new Aluno(23, "Lara", "Barriga da Lu", "Uni�o da Vit�ria", "PR", null, null, null);
		
		alunoRepo.save(Arrays.asList(a1, a2));
	}

}
