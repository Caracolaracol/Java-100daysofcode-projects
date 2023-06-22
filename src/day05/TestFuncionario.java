package day05;

public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setNombre("Diego");
        diego.setDocumento("31351551");
        diego.setSalario(2000);

        System.out.print(diego.getSalario());
    }
}


