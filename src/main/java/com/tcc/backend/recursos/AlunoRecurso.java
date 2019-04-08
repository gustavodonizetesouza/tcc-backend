package com.tcc.backend.recursos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/alunos")
public class AlunoRecurso {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST Ok!";
	}
}
