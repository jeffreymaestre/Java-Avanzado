package State;

public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear() Ya estaba desbloqueado el movil";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara() Camara ya estaba abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "La foto se va a disparar ya";
    }
}