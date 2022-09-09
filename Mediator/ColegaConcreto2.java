package Mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recibe() {
        System.out.println("Mensaje recibido, colega concreto 2");
    }

    @Override
    void envia() {
        System.out.println("Envia mensaje, colega concreto 2");
        mediator.reenvia(this);
    }
}
