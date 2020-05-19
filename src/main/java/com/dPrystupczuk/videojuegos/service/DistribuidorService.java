package com.dPrystupczuk.videojuegos.service;

import com.dPrystupczuk.videojuegos.domain.Distribuidor;
import org.springframework.stereotype.Service;
import com.dPrystupczuk.videojuegos.repository.DistribuidorRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Service
public class DistribuidorService {
    
    private final DistribuidorRepository distribuidorRepository;

    //constructor
    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }
    
     public List<Repository> buscarTodos(){
         return distribuidorRepository.findAll();
     }
}
