package Mediator;

public class ColegaConcreto3 extends Colega{
    @Override
    void recibe() {
        System.out.println("Mensaje recibido, colega concreto 3");
    }

    @Override
    void envia() {
        System.out.println("Envia mensaje, colega concreto 3");
        mediator.reenvia(this);
    }
}
