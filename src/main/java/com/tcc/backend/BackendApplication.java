package com.tcc.backend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcc.backend.dominio.Aluno;
import com.tcc.backend.repositorio.AlunoRepositorio;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{
	
	@Autowired
	private AlunoRepositorio alunoRepo;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		Aluno a1 = new Aluno(011, "Matheus", "Rua Severino", "Uni�o da Vit�ria", "PR", "(42)99953-6507", "matheus7@gmail.com", "123");
		Aluno a2 = new Aluno(023, "Lara", "Barriga da Lu", "Uni�o da Vit�ria", "PR", null, null, null);
		
		alunoRepo.save(Arrays.asList(a1, a2));
		
	}

}
