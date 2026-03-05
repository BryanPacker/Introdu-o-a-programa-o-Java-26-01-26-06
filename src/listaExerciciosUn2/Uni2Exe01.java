package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int number1, number2, value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");;
        number1 = sc.nextInt();
        System.out.println("Digite o primeiro número: ");;
        number2 = sc.nextInt();
        value = number1 + number2;
        System.out.println("A soma é igual a: " + value);

        int tstN1, tstN2;
        value = 1 + 0;
        System.out.println(value);
        value = 1 + 1;
        System.out.println(value);
        value = -3 + 0;
        System.out.println(value);
    }
}
