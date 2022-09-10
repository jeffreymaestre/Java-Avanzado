package State;

public class EstadoBloqueo extends Estado{
    public EstadoBloqueo(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear() Movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara() La camara esta bloqueada";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto() La camara esta bloqueada";
    }
}
