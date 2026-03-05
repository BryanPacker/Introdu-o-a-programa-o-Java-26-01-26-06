package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        Scanner prompt = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        A = prompt.nextInt();
        System.out.print("Digite o valor B: ");
        B = prompt.nextInt();
        System.out.print("Digite o valor C: ");
        C = prompt.nextInt();
        System.out.print("Digite o valor D: ");
        D = prompt.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.println("A diferença de AB com CD é igual a: " + DIFERENCA);
        prompt.close();
    }
}
