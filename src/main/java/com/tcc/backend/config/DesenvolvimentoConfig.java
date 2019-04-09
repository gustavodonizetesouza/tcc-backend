package com.tcc.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tcc.backend.servicos.BancoDeDadosServico;

@Configuration
@Profile("desenvolvimento")
public class DesenvolvimentoConfig {
	
	@Autowired
	private BancoDeDadosServico bds;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String estrategia;
	
	@Bean
	public boolean instanciarBancoDeDados() {
		
		if (!"create".equals(estrategia)) {
			return false;
		}
		bds.instanciarBancoDeDadosTeste();
		return true;
	}

}
