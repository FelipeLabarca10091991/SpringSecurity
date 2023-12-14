package com.fl.SpringSecurity.util;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fl.SpringSecurity.modelo.Authority;
import com.fl.SpringSecurity.modelo.Usuario;
import com.fl.SpringSecurity.repository.AuthorityRepository;
import com.fl.SpringSecurity.repository.UsuarioRepository;

@Component
public class Runner implements CommandLineRunner{

	private final UsuarioRepository userRepo;
	private final AuthorityRepository AuthRepo;
	
	
	
	public Runner(UsuarioRepository userRepo, AuthorityRepository authRepo)
	{	
		this.userRepo = userRepo;
		this.AuthRepo = authRepo;
	}



	@Override
	public void run(String... args) throws Exception 
	{
		//si no existen authorities, se crean aqui
		if(this.AuthRepo.count()==0) 
		{
			this.AuthRepo.saveAll(List.of(
								new Authority(AuthorityNames.ADMIN), 
								new Authority(AuthorityNames.READ), 
								new Authority(AuthorityNames.WRITE)
								));
		}
		
		if(this.userRepo.count()==0)
		{
			this.userRepo.saveAll(List.of(
					new Usuario("Felipe","felipe@falaca.cl","admin1234",List.of(this.AuthRepo.findByName(AuthorityNames.ADMIN).get())),
					new Usuario("User02","User02@falaca.cl","user1234",List.of(this.AuthRepo.findByName(AuthorityNames.READ).get())), 
					new Usuario("User03","User03@falaca.cl","user1234",List.of(this.AuthRepo.findByName(AuthorityNames.WRITE).get()))
					));
		}
	}
	
	

}
