package com.example.proyecto_final.Service;

import com.example.proyecto_final.Interfaces.DesktopRepository;
import com.example.proyecto_final.Model.Desktop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    private final DesktopRepository equipoRepository;

    public EquipoService(DesktopRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    public List<Desktop> obtenerTodosEquipos() {
        return equipoRepository.findAll();
    }

    public Desktop guardarEquipo(Desktop equipo) {
        return equipoRepository.save(equipo);
    }

    public void eliminarEquipo(Long id) {
        equipoRepository.deleteById(id);
    }
}
