package com.example.proyecto_final.Interfaces;

import com.example.proyecto_final.Model.Desktop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Desktop, Long> {

}
