package com.tcc.backend.seguranca;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTFiltroAutenticacao extends UsernamePasswordAuthenticationFilter {

	// intercepta o POST endpoint /login passando o email e senha

	private AuthenticationManager authenticationManager;
	private JWTUtil jwtUtil;
	
	public JWTFiltroAutenticacao(AuthenticationManager authenticationManager, JWTUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }
	

	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
			throws AuthenticationException {

		try {
			//tenta pegar as credenciais na requisição
			Credenciais creds = new ObjectMapper().readValue(req.getInputStream(), Credenciais.class);

			//instancia com as credenciais
			UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(creds.getEmail(),
					creds.getSenha(), new ArrayList<>());

			//verifica se usuario e senha sao validos
			Authentication auth = authenticationManager.authenticate(authToken);
			return auth;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	//autorizacao com sucesso executa esse metodo
	@Override
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
			Authentication auth) throws IOException, ServletException {

		String username = ((Usuario) auth.getPrincipal()).getUsername();
		String token = jwtUtil.gerarToken(username);
		res.addHeader("Autorizacao", "Portador " + token);
	}

}
