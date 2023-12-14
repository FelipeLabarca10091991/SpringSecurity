package com.fl.SpringSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.fl.SpringSecurity.modelo.Authority;
import com.fl.SpringSecurity.util.AuthorityNames;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{

	Optional<Authority> findByName(AuthorityNames name);
}
