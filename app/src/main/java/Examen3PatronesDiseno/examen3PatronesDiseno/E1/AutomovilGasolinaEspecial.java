package Examen3PatronesDiseno.examen3PatronesDiseno.E1;

public class AutomovilGasolinaEspecial implements Automovil {
    private int gasolinaEspecialActual;

    public int getGasolinaEspecialActual() {
        return gasolinaEspecialActual;
    }

    public void setGasolinaEspecialActual(int gasolinaEspecialActual) {
        this.gasolinaEspecialActual = gasolinaEspecialActual;
    }

    public AutomovilGasolinaEspecial(){
        this.gasolinaEspecialActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadGasolinaEspecial) {
        if(cantidadGasolinaEspecial >= 0 && cantidadGasolinaEspecial <= 100){
            this.gasolinaEspecialActual = cantidadGasolinaEspecial;
            System.out.println("Monto de gasolina especial actual: " + cantidadGasolinaEspecial);
        }else{
            System.out.println("Rango de diesel " + cantidadGasolinaEspecial + " no valido!");
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*100);
        return cantidadRandom;
    }
}
