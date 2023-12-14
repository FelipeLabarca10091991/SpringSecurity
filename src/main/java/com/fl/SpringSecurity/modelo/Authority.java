package com.fl.SpringSecurity.modelo;

import com.fl.SpringSecurity.util.AuthorityNames;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autorities")
public class Authority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private AuthorityNames name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AuthorityNames getName() {
		return name;
	}

	public void setName(AuthorityNames name) {
		this.name = name;
	}

	public Authority(Long id, AuthorityNames name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Authority() {
		super();
	}

	public Authority(AuthorityNames name) {
		super();
		this.name = name;
	}
	
	

}
