package day1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
        double variable1 = 230.89;
        int variable1Entero = (int) variable1;
        System.out.println(variable1Entero); // cast

        long prueba = 122222222222L;
        short numeroPequeno = 13555;
        byte numeroAunMasPequeno = 1; // 8 bits of size

        float numeroDecimalPequeno = 2.5F;

        int resultado = (int) variable1 + variable1Entero;
        System.out.println(resultado);

        double salario = 1270.50;
        int valor = (int) salario;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);
    }

}