package Observer;

public class Main {
    public static void main(String args[]){
        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorSatelite satelite = new ReceptorSatelite();
        ReceptorRadio radio = new ReceptorRadio();

        emisora.meteReceptor(tv);
        emisora.meteReceptor(satelite);
        emisora.meteReceptor(radio);

        emisora.emite();
    }
}
