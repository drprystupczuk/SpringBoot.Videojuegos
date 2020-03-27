
package com.dPrystupczuk.videojuegos.service;

import domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    
    public List<Videojuego> buscarDestacados(){
        List<Videojuego> destacados = new ArrayList<>();
        
        Videojuego juego = new Videojuego();
        juego.setNombre("Counter Strike Global Offensive");
        juego.setDescripcion("Es un videojuego de disparos en primera persona desarrollado por Valve Corporation en cooperación con Hidden Path Entertainment");
        juego.setImagenUrl("https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/03/27/15537190644260.png");
        destacados.add(juego);
        
        
        juego = new Videojuego();
        juego.setNombre("Rocket League");
        juego.setDescripcion("Es un videojuego que combina el fútbol con los vehículos. Fue desarrollado por Psyonix y lanzado el 7 de julio del 2015");
        juego.setImagenUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Rocket_League_coverart.jpg/490px-Rocket_League_coverart.jpg");
        destacados.add(juego);
        
        
        juego = new Videojuego();
        juego.setNombre("The Witcher 3");
        juego.setDescripcion("Es un videojuego de rol desarrollado por CD Projekt RED. CD Projekt RED es el desarrollador mientras que la distribución corre a cargo de la Warner Bros. Interactive, en el caso de Norteamérica y Bandai Namco para Europa");
        juego.setImagenUrl("https://i11d.3djuegos.com/juegos/9592/the_witcher_3/fotos/ficha/the_witcher_3-2546815.jpg");
        destacados.add(juego);
        
        
        juego = new Videojuego();
        juego.setNombre("FIFA 20");
        juego.setDescripcion("Es un videojuego de fútbol. Desarrollado por EA");
        juego.setImagenUrl("https://generacionxbox.com/wp-content/uploads/2019/05/D55j5xfW4AA5dkm.jpg");
        destacados.add(juego);
        
        return destacados;
    }
}
