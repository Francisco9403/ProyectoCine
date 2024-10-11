package com.FranDev.ProyectoCine.repositorios;

import com.FranDev.ProyectoCine.modelos.pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface peliculaRepositorio extends JpaRepository<pelicula,Integer> {

}

