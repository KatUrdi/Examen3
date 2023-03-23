package Examen3PatronesDiseno.examen3PatronesDiseno.E3;

public class Paquete {
    private int precio;
    private String nombrePaquete;
    private int peso;

    
    public Paquete(int precio, String nombrePaquete, int peso) {
        this.precio = precio;
        this.nombrePaquete = nombrePaquete;
        this.peso = peso;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getPrecio() {
        return precio;
    }
    public String getNombrePaquete() {
        return nombrePaquete;
    }
    public int getPeso() {
        return peso;
    }
    
}
