package State;

public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Movil ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "Camara ya estaba abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueo(telefono));
        return "La foto se ha hecho";
    }
}
