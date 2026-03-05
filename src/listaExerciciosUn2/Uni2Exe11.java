package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual o valor de A? ");
        a = prompt.nextDouble();
        System.out.println("Qual o valor de B? ");
        b = prompt.nextDouble();
        System.out.println("Qual o valor de C? ");
        c = prompt.nextDouble();

        double area, circulo, javaPI;
        area = (a * c) / 2;
        javaPI = Math.PI;

        circulo = javaPI * (Math.pow(c, 2));
    }
}
