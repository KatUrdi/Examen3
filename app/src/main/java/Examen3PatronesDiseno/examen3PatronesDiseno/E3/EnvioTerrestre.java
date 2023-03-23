package Examen3PatronesDiseno.examen3PatronesDiseno.E3;

public class EnvioTerrestre implements MetodoEnvioImplementator {
    @Override
    public double aumentoPrecio() {
        return 1.05;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio Terrestre";
    }
}
