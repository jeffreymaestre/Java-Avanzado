package Refactor;

import java.util.Arrays;

public class Main {
    public static void main(String []args){
        int numeros[] = {12, 5,90, 8,10, 0};
        imprimeMayorYMenor(numeros);
    }

    public static void imprimeMayorYMenor(int []numeros){
        int mayor = Arrays.stream(numeros).reduce(0,(a,b) -> a > b ? a: b);
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a,b) -> a < b ? a: b );

        System.out.println("Mayor: " + mayor + " Menor: " + menor);

    }

    public static int ifAnidado(){
        int valor1 = 10;
        int valor2 = 10;

        if (valor1 > valor2){
            return valor1;
        }

        return valor2;
    }
}
