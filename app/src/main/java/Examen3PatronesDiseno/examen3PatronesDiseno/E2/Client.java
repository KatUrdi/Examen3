package Examen3PatronesDiseno.examen3PatronesDiseno.E2;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        Usuario usuario1 = new Usuario(36, "Flavia", "150"); //no primo
        Usuario usuario2 = new Usuario(5, "Maya", "203"); //primo

        proxy.login(usuario1);
        proxy.login(usuario2);

        proxy.showUsuariosLogueados();

    }
    
}
