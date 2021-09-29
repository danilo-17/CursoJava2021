package com.danilo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilo.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
