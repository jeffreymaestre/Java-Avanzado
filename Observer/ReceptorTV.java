package Observer;

public class ReceptorTV implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida desde la TV");
    }
}
