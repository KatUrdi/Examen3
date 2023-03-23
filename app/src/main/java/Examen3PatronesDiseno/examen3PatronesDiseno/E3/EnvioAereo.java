package Examen3PatronesDiseno.examen3PatronesDiseno.E3;

public class EnvioAereo implements MetodoEnvioImplementator{
    @Override
    public double aumentoPrecio() {
        return 1.10;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio Aereo";
    }
}
