package Examen3PatronesDiseno.examen3PatronesDiseno.E2;
import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private static List<Integer> idUsuariosRegistrados = new ArrayList<>(List.of(5, 7, 8, 10, 36));

    public static List<Integer> getIdUsuariosRegistrados() {
        return idUsuariosRegistrados;
    }
    
}
