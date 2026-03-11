package Un1;

import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        double raio, value, powNumber, piJava;
        Scanner prompt = new Scanner(System.in);
        System.out.print("Qual o Raio da circunferência: ");
        powNumber = 2;
        raio = prompt.nextInt();
        value = Math.pow(raio , powNumber);
        piJava = Math.PI;
        value = value * piJava;
        prompt.close();
        System.out.println(value);
    }
}
