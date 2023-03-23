package Examen3PatronesDiseno.examen3PatronesDiseno.E3;

public class Client {
    public static void main(String[] args) {
        EnvioTerrestre envioTerrestre = new EnvioTerrestre();
        EnvioAereo envioAire = new EnvioAereo();
        EnvioMar envioAgua = new EnvioMar();

        Paquete paquete = new Paquete(250,"Paquete",8);

        EmpresaSA empresaSA = new EmpresaSA();
        EmpresaSRL empresaSRL = new EmpresaSRL();

        empresaSA.setFormaEnvio(envioTerrestre);
        empresaSA.enviarPaquete(paquete);

        empresaSRL.setFormaEnvio(envioAire);
        empresaSRL.enviarPaquete(paquete);


        empresaSA.setFormaEnvio(envioAgua);
        empresaSA.enviarPaquete(paquete);

    }
}
