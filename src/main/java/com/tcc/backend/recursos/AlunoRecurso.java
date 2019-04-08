package com.tcc.backend.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.backend.dominio.Aluno;

@RestController
@RequestMapping(value="/alunos")
public class AlunoRecurso {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Aluno> listar() {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setCpf(1);
		aluno1.setNome("João");
		
		aluno2.setCpf(2);
		aluno2.setNome("Maria");
		
		List<Aluno> lista = new ArrayList<>();
		
		lista.add(aluno1);
		lista.add(aluno2);
		
		return lista;
	}
}
