package Examen3PatronesDiseno.examen3PatronesDiseno.E2;

public class Proxy implements IServer{
    private IServer servidor1;
    private IServer servidor2;

    public Proxy(){
        servidor1 = new Servidor("Servidor 1");
        servidor2 = new Servidor("Servidor 2");
    }
    
    @Override
    public void login(Usuario usuario) {
        if(BaseDatos.getIdUsuariosRegistrados().contains(usuario.getId())){
            if(isPrimo(usuario.getId())) {
                servidor1.login(usuario);
            } else {
                servidor2.login(usuario);
            }
        }else{
            System.out.println("El usuario no esta registrado en la base de datos");
        }
    }
    @Override
    public void showUsuariosLogueados(){
        servidor1.showUsuariosLogueados();
        servidor2.showUsuariosLogueados();
    }

    public static boolean isPrimo(int num) {
        boolean isPrimo = true;
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }
        return isPrimo;
    }
    
}
