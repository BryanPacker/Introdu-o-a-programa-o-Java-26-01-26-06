package Un1;

import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        int idNumber;
        double numberHours, hourPay, monthPayment;
        Scanner prompt = new Scanner(System.in);

        System.out.print("What are you identity number? ");
        idNumber = prompt.nextInt();
        System.out.print("What amount are you being payed for each hour worked? ");
        hourPay = prompt.nextDouble();
        System.out.print("How many time did you work this month? ");
        numberHours = prompt.nextDouble();

        monthPayment = numberHours * hourPay;
        System.out.printf("Your payment will be: %.2f Your id number is: %d", monthPayment, idNumber);
        prompt.close(); 
        
    }
}
