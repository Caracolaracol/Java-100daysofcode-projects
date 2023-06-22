package day3;

public class Main {

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 9;
        System.out.println(numero2);

        numero2 = numero1;
        System.out.println(numero2);

        numero1 = 88;
        // numero2 =  ??
        System.out.println("Hello world");

        int edad = 28;
        int cantidadPersonas = 2;
        boolean esPareja = cantidadPersonas > 1;
        if (edad >= 18 && esPareja) {
            System.out.println("Usted puede entrar");
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usted no está permitido a entrar");
        }

        int contador = 0;
        int total = 0;
        while (contador <= 10) { // mientras (condicion)
            //ejecuta esto, easy,
            total = total + contador;
            contador++;
        }
        System.out.println(total);

        for (int contadore = 0; contadore <= 10 ; contadore++) {
            System.out.println(contadore);
        }

    }
}
