package Singleton;

public class Main {
    public static void main(String args[]){

        Aplication app = Aplication.getInstance();
        Aplication app2 = Aplication.getInstance();

        app.Run();
        app2.Run();

        System.out.println(app + " " + app2);

    }
}
