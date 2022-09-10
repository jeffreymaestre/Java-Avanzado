package State;

public class Main {
    public static void main(String []args){
        Telefono telefono = new Telefono();
        //Telefono telefono2 = new Telefono();

        System.out.println(telefono.estado.desbloquear());
        System.out.println(telefono.estado.abrirCamara());
        System.out.println(telefono.estado.hacerFoto());
        System.out.println(telefono.estado.hacerFoto());
        System.out.println(telefono.estado.hacerFoto());
    }
}
