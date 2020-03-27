package com.dPrystupczuk.videojuegos.controller;

import com.dPrystupczuk.videojuegos.service.VideojuegoService;
import domain.Videojuego;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class ListadoController {
    
    private final VideojuegoService videojuegoService;

    
    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;    
    }
    
    @RequestMapping("/")
    public String listarVideojuegos(Model model){
        //búsqueda de los videojuegos
        
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        
        for (int i = 0; i < destacados.size(); i++) {
            System.out.println("videojuego: " + destacados.get(i).toString());
        }

        return "listado";
    }
}
