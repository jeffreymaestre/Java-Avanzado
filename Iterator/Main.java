package Iterator;

public class Main {
    public static void main(String args[]){
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Jeffrey", 24));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es "+ usuario.getNombre());
        }
    }
}
