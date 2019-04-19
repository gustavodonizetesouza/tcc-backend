package com.tcc.backend.seguranca;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
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
	
	public boolean tokenValido(String token) {
		Claims claims = getClaims(token);
		if (claims != null) {
			String username = claims.getSubject();
			Date expirationDate = claims.getExpiration();
			Date now = new Date(System.currentTimeMillis());
			if (username != null && expirationDate != null && now.before(expirationDate)) {
				return true;
			}
		}
		return false;
	}

	public String getUsername(String token) {
		Claims claims = getClaims(token);
		if (claims != null) {
			return claims.getSubject();
		}
		return null;
	}

	private Claims getClaims(String token) {
		try {
			return Jwts.parser().setSigningKey(segredo.getBytes()).parseClaimsJws(token).getBody();
		}
		catch (Exception e) {
			return null;
		}
	}

}
