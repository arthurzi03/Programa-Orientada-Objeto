package aula2;
public class arthur {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.numA=2.0;
        calc.numB=3.0;
        System.out.println("soma: " + calc.somar());
        System.out.println("subtrair: " + calc.subtrair());
        System.out.println("multiplicar: " + calc.multiplicar());
        System.out.println("dividir: " + calc.dividir());
    }
}