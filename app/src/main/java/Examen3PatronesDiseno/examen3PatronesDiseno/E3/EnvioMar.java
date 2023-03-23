package Examen3PatronesDiseno.examen3PatronesDiseno.E3;

public class EnvioMar implements MetodoEnvioImplementator {
    @Override
    public double aumentoPrecio() {
        return 1.25;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio Mar";
    }
}
