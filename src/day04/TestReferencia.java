package day04;

public class TestReferencia {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "45444332";
        diego.telefono = "999929232";
        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.agencia = 1;
        cuentaDeDiego.titular = diego;

        System.out.print(cuentaDeDiego.titular.documento);
    }
}
