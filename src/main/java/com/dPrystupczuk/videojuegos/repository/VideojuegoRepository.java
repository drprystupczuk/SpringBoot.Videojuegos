package com.dPrystupczuk.videojuegos.repository;

import com.dPrystupczuk.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego,Integer>{
    
    //Métodos útiles de JpaRepository
    // findAll()
    // findById()
    // save()
    // delete()
}
