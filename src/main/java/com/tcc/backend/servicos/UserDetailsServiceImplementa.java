package com.tcc.backend.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcc.backend.dominio.Aluno;
import com.tcc.backend.repositorio.AlunoRepositorio;
import com.tcc.backend.seguranca.Usuario;

@Service
public class UserDetailsServiceImplementa implements UserDetailsService {

	@Autowired
	private AlunoRepositorio repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Aluno alu = repo.findByEmail(email);
		if (alu == null) {
			throw new UsernameNotFoundException(email);
		}
		return new Usuario(alu.getCpf(), alu.getEmail(), alu.getSenha());
	}

}
