import java.util.Random;

public class FuncoesDoJava {
    public static void main(String[] args) {
        // raiz quadrada

        double number = 25;
        double value = Math.sqrt(number);
        System.out.println(value);

        // potencia
        number = 4 ;
        double potencia = 2;
        value = Math.pow(number, potencia);
        System.out.println(value);  

        // Quando usada "final" transforma a variavel em constante que 
        // nao pode ser alterada durante todo o resto do código
        final double pi = 3.1416;
        double piJava = Math.PI;
        System.out.println(piJava + "\n" + pi);

        // função que pega o maior número
        int num1 = 10;
        int num2 = 20;
        int MaxValue = Math.max(num1, num2);
        System.out.println("The Max number is: " + MaxValue);

        double aleatorio = Math.random();
        // definindo um número randomico de 1 a 99
        Random random = new Random();
        int numeroAte = random.nextInt(100);
        System.out.println(aleatorio);
        System.out.println(numeroAte);
    }
}
