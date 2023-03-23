package Examen3PatronesDiseno.examen3PatronesDiseno.E1;

public class AutomovilGasolina implements Automovil {
    private int gasolinaActual;

    public int getGasolinaActual() {
        return gasolinaActual;
    }

    public void setGasolinaActual(int gasolinaActual) {
        this.gasolinaActual = gasolinaActual;
    }

    public AutomovilGasolina(){
        this.gasolinaActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadGasolina) {
        if(cantidadGasolina >= 0 && cantidadGasolina <= 100){
            this.gasolinaActual = cantidadGasolina;
            System.out.println("Monto de la gasolina actual: " + cantidadGasolina);
        }else{
            System.out.println("Rango de gasolina " + cantidadGasolina + " no es valido");
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*100);
        return cantidadRandom;
    }
}
