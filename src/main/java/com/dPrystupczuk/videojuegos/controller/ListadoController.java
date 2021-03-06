package com.dPrystupczuk.videojuegos.controller;

import com.dPrystupczuk.videojuegos.service.VideojuegoService;
import com.dPrystupczuk.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        
        return "listado"; //hace referencia a el archivo listado.html
    }
    
    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model){
        List<Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
    
    @RequestMapping("/buscar")
        public String buscar(@RequestParam("q") String consulta, Model model){
        List<Videojuego> juegos = videojuegoService.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
}
