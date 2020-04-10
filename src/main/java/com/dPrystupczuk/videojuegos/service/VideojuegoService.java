
package com.dPrystupczuk.videojuegos.service;

import com.dPrystupczuk.videojuegos.domain.Videojuego;
import com.dPrystupczuk.videojuegos.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    
    private final VideojuegoRepository videojuegoRepository;
    
    public VideojuegoService(VideojuegoRepository videojuegoRepository){
        //Inyección de dependencias
        this.videojuegoRepository = videojuegoRepository;
    }
    
    public List<Videojuego> buscarDestacados(){
        return videojuegoRepository.buscarTodos();
    }
    
        public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }
}
