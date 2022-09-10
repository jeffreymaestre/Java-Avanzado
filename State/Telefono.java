package State;

public class Telefono {

    public Estado estado;

    public void cambiaEstado(Estado estado){
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: " + this.estado.getClass().getName());
    }

    public Telefono(){
        estado = new EstadoBloqueo(this);
    }

    public Estado getEstado(){
        return estado;
    }
}
