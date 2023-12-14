package com.fl.SpringSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fl.SpringSecurity.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

	Optional<Usuario> findByUserName(String user);
}
