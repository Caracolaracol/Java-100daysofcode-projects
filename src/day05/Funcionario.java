package day05;

public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private int Tipo;

    // constructor. metodo del mismo tipo de retorno que la clase y que puede aceptar parámetros para asignarlos(o no) a las variables
    public Funcionario(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        Tipo = tipo;
    }

    public double getBonificacion(){
        // si es 1 es gerent si es 0 es funcionario
        if (this.Tipo == 0) {
            return this.salario*0.1;
        } else if (this.Tipo == 1) {
            return this.salario;
        } else {
            return 0;
        }

    }
}
