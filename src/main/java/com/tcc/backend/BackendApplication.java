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
	

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		
		
	}

}
