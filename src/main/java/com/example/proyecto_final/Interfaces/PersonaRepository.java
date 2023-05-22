package com.example.proyecto_final.Interfaces;

import com.example.proyecto_final.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

