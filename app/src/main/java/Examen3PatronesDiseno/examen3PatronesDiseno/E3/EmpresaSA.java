package Examen3PatronesDiseno.examen3PatronesDiseno.E3;

public class EmpresaSA extends EmpresaAbstraction {
    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("La empresa SA esta enviando "+paquete.getNombrePaquete()+
        " con un costo de:  "+
        (int)(metodoEnvioImplementador.aumentoPrecio()*paquete.getPrecio())+" Bs por "+metodoEnvioImplementador.nombreFormaEnvio());
    }
}
