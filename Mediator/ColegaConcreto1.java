package Mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("Mensaje recibido, colega concreto 1");
    }

    @Override
    void envia() {
        System.out.println("Envia mensaje, colega concreto 1");
        mediator.reenvia(this);
    }
}
