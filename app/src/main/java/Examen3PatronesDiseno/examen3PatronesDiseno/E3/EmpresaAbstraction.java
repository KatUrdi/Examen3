package Examen3PatronesDiseno.examen3PatronesDiseno.E3;

public abstract class EmpresaAbstraction {
    protected MetodoEnvioImplementator metodoEnvioImplementador;

    public EmpresaAbstraction() {
        this.metodoEnvioImplementador = new EnvioTerrestre(); 
    }

    public void setFormaEnvio(MetodoEnvioImplementator metodoPagoImplementator) {
        this.metodoEnvioImplementador = metodoPagoImplementator;
    }

    public abstract void enviarPaquete(Paquete paquete);

}
