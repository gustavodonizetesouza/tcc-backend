package com.tcc.backend.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.backend.dominio.Aluno;
import com.tcc.backend.servicos.AlunoServico;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoRecurso {

	@Autowired
	private AlunoServico srv;

	// define o endpoint do método
	@RequestMapping(value = "/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer cpf) {

		Aluno obj = srv.buscar(cpf);

		// retorna ok com o objeto no corpo
		return ResponseEntity.ok().body(obj);

	}
}
