package Examen3PatronesDiseno.examen3PatronesDiseno.E1;

public class AdapterAutomovilElectrico implements Automovil {
    private AutomovilElectrico automovilElectrico;

    public AdapterAutomovilElectrico(AutomovilElectrico automovilElectrico){
        this.automovilElectrico = automovilElectrico;
    }

    @Override
    public void llenarCombustible(int cantidadCombustible) {
        automovilElectrico.cargar((int) (cantidadCombustible/5));
    }

    @Override
    public int estadoCombustible() {
        return automovilElectrico.estadoDeEletricidad();
    }
}
