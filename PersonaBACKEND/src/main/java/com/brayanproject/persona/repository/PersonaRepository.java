package com.brayanproject.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanproject.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
