package Un1;

import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float number1, number2, mediaPond;
        Scanner prompt = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        number1 = prompt.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        number2 = prompt.nextFloat();
        mediaPond = (number1 * 0.35f + number2 * 0.75f) / 1.1f ;
        System.out.println("A média ponderada fica um total de: " + mediaPond);
    }
}
