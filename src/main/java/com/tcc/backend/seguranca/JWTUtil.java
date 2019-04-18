package com.tcc.backend.seguranca;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
	
	// gera o token de autenticacao
	
	@Value("${jwt.secret}")
	private String segredo;
	
	@Value("${jwt.expiration}")
	private Long expira;
	
	public String gerarToken(String email) {
		return Jwts.builder()
				.setSubject(email)
				.setExpiration(new Date(System.currentTimeMillis() + expira))
				.signWith(SignatureAlgorithm.HS512, segredo.getBytes())
				.compact();
	}

}
