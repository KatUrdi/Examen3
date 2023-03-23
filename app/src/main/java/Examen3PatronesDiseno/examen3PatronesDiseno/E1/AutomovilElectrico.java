package Examen3PatronesDiseno.examen3PatronesDiseno.E1;

public class AutomovilElectrico {
    private int porcentajeCargado;

    public int getPorcentajeCargado() {
        return porcentajeCargado;
    }

    public void setPorcentajeCargado(int porcentajeCargado) {
        this.porcentajeCargado = porcentajeCargado;
    }

    public AutomovilElectrico(){
        this.porcentajeCargado = 0;
    }

    public void cargar(int montoCarga){
        if(montoCarga >= 0 && montoCarga <= 100){
            this.porcentajeCargado = montoCarga;
            System.out.println("Monto de la carga actual: " + montoCarga);
        }else{
            System.out.println("Rango de carga " + montoCarga + " No es valido");
        }
    }

    public int estadoDeEletricidad() {
        int cantidadRandom = (int) (Math.random()*10);
        return cantidadRandom;
    }
}
