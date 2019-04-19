package com.tcc.backend.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Usuario implements UserDetails {

	private static final long serialVersionUID = 1L;
	private Integer cpf;
	private String email;
	private String senha;
	private Collection<? extends GrantedAuthority> auth;

	public Usuario() {
	}

	public Usuario(Integer cpf, String email, String senha) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return auth;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return email;
	}

	public Integer getCpf() {
		return cpf;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
