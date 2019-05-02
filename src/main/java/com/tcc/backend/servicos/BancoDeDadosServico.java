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
		Aluno a1 = new Aluno(1, "Professor", "PUCMinas", "Belo Horizonte", "MG", "(31)3319-4444", "professor@professor.com", pe.encode("123"));
		Aluno a2 = new Aluno(2, "Gustavo", "TCC", "Belo Horizonte", "MG", "(35)8822-5913", "g@g.com", pe.encode("g"));
		Aluno a3 = new Aluno(3, "Fábio Aparecido", "Avenida Brasil", "São Paulo", "SP", "(00)3333-1122", "fabio_aparecido@gmail.com", pe.encode("235689"));
		Aluno a4 = new Aluno(4, "José Luiz", "Avenida Paulista", "São Paulo", "SP", "(21)2121-2122", "jose_luiz@gmail.com", pe.encode("luiz1755"));
		Aluno a5 = new Aluno(5, "Irene Souza", "Navegantes", "Rio de Janeiro", "RJ", "(11)1111-1111", "irene_souza@hotmail.com", pe.encode("591300"));
		Aluno a6 = new Aluno(6, "Priscila Faria", "Ponte Nova", "Curitiba", "PR", "(41)4433-4343", "priscilafaria@yahoo.com.br", pe.encode("28042019"));
		
		alunoRepo.save(Arrays.asList(a1, a2, a3, a4, a5, a6));
	}

}
