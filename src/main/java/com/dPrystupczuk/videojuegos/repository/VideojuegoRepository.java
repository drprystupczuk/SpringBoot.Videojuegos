package com.dPrystupczuk.videojuegos.repository;

import com.dPrystupczuk.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideojuegoRepository extends JpaRepository<Videojuego,Integer>{
    
    //Métodos útiles de JpaRepository
    // findAll()
    // findById()
    // save()
    // delete()    
    
    //Ejemplo para usar SQL Nativo
    //@Query(value = "SELECT * FROM Videojuego", nativeQuery = true) 
    //List<Videojuego> buscarTodosSQL();
    
    //JPQL Videojuego hace ref a la clase
    @Query("from Videojuego v ORDER BY v.nombre") 
    List<Videojuego> buscarTodos();
    
    @Query("from Videojuego v WHERE v.distribuidor.id = ?1 ORDER BY v.nombre") 
    List<Videojuego> buscarPorDistribuidor(int distribuidor);
    
    //forma antigua de hacerlo
        //@Query("from Videojuego v WHERE v.nombre like %?1% ORDER BY v.nombre") 
        //List<Videojuego> buscar(String consulta);

    //aprovechando JPA
    //findBy + nombreAtributo + Containing (opcional para hacer LIKE)
    List<Videojuego> findByNombreContaining(String consulta);
}
