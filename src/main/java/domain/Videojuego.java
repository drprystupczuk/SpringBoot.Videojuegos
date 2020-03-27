package domain;

public class Videojuego {
    private String nombre;
    private String descripcion;
    private String imagenUrl;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
    
    @Override
    public String toString(){
      return "Nombre: "+ this.nombre + ", "
              + "Descripcion: "+ this.descripcion+ ", "
              + "urlImange: " + this.imagenUrl;         
    }
}
