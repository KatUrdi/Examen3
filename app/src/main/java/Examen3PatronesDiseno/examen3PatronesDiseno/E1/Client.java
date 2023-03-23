package Examen3PatronesDiseno.examen3PatronesDiseno.E1;

public class Client {
    public static void main (String [] args){
        AutomovilGasolina automovilGasolina = new AutomovilGasolina();
        AutomovilDiesel automovilDiesel = new AutomovilDiesel();
        AutomovilGasolinaEspecial automovilGasolinaEspecial = new AutomovilGasolinaEspecial();

        AdapterAutomovilElectrico automovilElectrico = new AdapterAutomovilElectrico(new AutomovilElectrico());

        System.out.println("----Automovil Gasolina----");
        int gasolinaActual =automovilGasolina.estadoCombustible();
        System.out.println("Gasolina actual: " + gasolinaActual);
        automovilGasolina.llenarCombustible(45);

        System.out.println("----Automovil Diesel----");
        int dieselActual = automovilDiesel.estadoCombustible();
        System.out.println("Diesel actual: " + dieselActual);
        automovilDiesel.llenarCombustible(36);

        System.out.println("----Automovil Gasolina Especial----");
        int gasolinaEspecialActual = automovilGasolinaEspecial.estadoCombustible();
        System.out.println("Gasolina especial actual: " + gasolinaEspecialActual);
        automovilGasolinaEspecial.llenarCombustible(13);

        System.out.println("----Automovil Electrico----");
        int cargaActual = automovilElectrico.estadoCombustible();
        System.out.println("Carga actual: " + cargaActual);
        automovilElectrico.llenarCombustible(30); 
    }
}
