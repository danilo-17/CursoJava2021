package com.danilo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilo.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByNombre(String pNombre);

}
