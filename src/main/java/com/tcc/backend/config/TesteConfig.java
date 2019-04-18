package com.tcc.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tcc.backend.servicos.BancoDeDadosServico;

@Configuration
@Profile("teste")
public class TesteConfig {
	
	@Autowired
	private BancoDeDadosServico bds;
	
	@Bean
	public boolean instanciarBancoDeDados() {
		bds.instanciarBancoDeDadosTeste();
		return true;
	}

}
