
package com.dPrystupczuk.videojuegos.controller;

import com.dPrystupczuk.videojuegos.domain.Videojuego;
import com.dPrystupczuk.videojuegos.service.DistribuidorService;
import com.dPrystupczuk.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoAbmController {
    
    private final DistribuidorService distribuidorService;
    private final VideojuegoService videojuegoService;
    
    //constructor
    public VideojuegoAbmController(DistribuidorService distribuidorService, VideojuegoService videojuegoService) {
        this.distribuidorService = distribuidorService;
        this.videojuegoService = videojuegoService;
    }
    
    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model){
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego() );
        return "formVideojuego";
    }
    
    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuego videojuego){
        //System.out.println(videojuego);
        videojuegoService.guardar(videojuego);
        return "redirect:/";
    }
}
