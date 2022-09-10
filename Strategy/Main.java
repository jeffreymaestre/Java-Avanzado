package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String []args){
        UsuariosFicheros usuariosMemoria = new UsuariosFicheros();
        crear(usuariosMemoria,"Jeffrey");
        crear(usuariosMemoria,"Alejandro");
        crear(usuariosMemoria,"Maestre");
        crear(usuariosMemoria,"Argote");

        for (String usuario: usuariosMemoria.listar()) {
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
