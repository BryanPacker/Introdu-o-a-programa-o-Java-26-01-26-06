package Un1;

import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int number1, number2, mult;
        Scanner prompt = new Scanner(System.in);
      
        System.out.print("Digite o primeiro número da multiplicação: ");
        number1 = prompt.nextInt();

        System.out.print("Digite o segundo número da multiplicação: ");
        number2 = prompt.nextInt();

        mult = number1 * number2;
        System.out.println("O valor da multiplicação é igual a: " + mult);

        int tstN1, tstN2, tstValue;
        tstN1 = 10;
        tstN2 = 10;
        tstValue = tstN1 * tstN2;
        System.out.println(tstValue);

        tstN1 = 1;
        tstN2 = -5;
        tstValue = tstN1 * tstN2;
        System.out.println(tstValue);        
    }
}
