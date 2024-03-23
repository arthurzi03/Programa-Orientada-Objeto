package atividade1;
public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.numA=2;
        calc.numB=3;
        System.out.println("soma:"+ calc.somar());
        System.out.println("subtrair:"+ calc.subtrair());
        System.out.println("multiplicar:"+ calc.multiplicar());
        System.out.println("dividir:"+ calc.dividir());
        System.out.println("0:"+ calc.verificarNumeroPrimo(0));
        System.out.println("1:"+ calc.verificarNumeroPrimo(1));
        System.out.println("2:"+ calc.verificarNumeroPrimo(2));
        System.out.println("4:"+ calc.verificarNumeroPrimo(4));
        System.out.println("11:"+ calc.verificarNumeroPrimo(11));
    }
    
}