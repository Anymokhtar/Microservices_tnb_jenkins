package com.example.vol.security.services;

import java.util.Collection;

import java.util.Objects;

import com.example.vol.models.Utilisateur;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserPrincipal implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String username;
	@JsonIgnore
	private String password;

	private String role;


	private Collection<? extends GrantedAuthority> authorities;

	public UserPrincipal(Long id, String username, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserPrincipal build(Utilisateur user) {

		return new UserPrincipal(
				user.getId(), 
				user.getUsername(), 
				user.getPassword(),
				null);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public Long getId() {
		return id;
	}


	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserPrincipal user = (UserPrincipal) o;
		return Objects.equals(id, user.id);
	}
}
