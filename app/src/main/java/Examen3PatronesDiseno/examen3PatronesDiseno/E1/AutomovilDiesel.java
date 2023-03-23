package Examen3PatronesDiseno.examen3PatronesDiseno.E1;

public class AutomovilDiesel {
    private int dieselActual;

    public int getDieselActual() {
        return dieselActual;
    }

    public void setDieselActual(int dieselActual) {
        this.dieselActual = dieselActual;
    }

    public AutomovilDiesel(){
        this.dieselActual = 0;
    }

    
    public void llenarCombustible(int cantidadDiesel) {
        if(cantidadDiesel >= 0 && cantidadDiesel <= 100){
            this.dieselActual = cantidadDiesel;
            System.out.println("Monto de la gasolina actual: " + cantidadDiesel);
        }else{
            System.out.println("Rango de diesel " + cantidadDiesel + " no es valido");
        }
    }

    
    
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*100);
        return cantidadRandom;
    }
}
