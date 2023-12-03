package com.fl.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fl.SpringSecurity.modelo.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long>{

}
