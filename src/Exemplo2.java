import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Aula 25/02/2026");

        // Váriaveis
        //float prova1 = 0f;
        //float prova2 = 0f;
        //float trabalhoFinal = 0f;

        // Cálculos de Média Aritmética / Ponderada
        //float mediaTrabalhos = (10 + 8.5f + 0 + 5 + 10 + 9.8f + 9.5f) / 7;
        //float mediaFinal = (prova1 * 0.2f) + (prova2 * 0.3f) + (trabalhoFinal * 0.3f) + (mediaTrabalhos * 0.2f);

        // Médias Aluno
        //System.out.println("A média final do semestre é igual a: " + mediaFinal);
        //System.out.println("A média final dos trabalhos é igual a: " + mediaTrabalhos);

        // Váriaveis prova
        float prova1;
        float prova2;
        float trabalhoFinal;

        Scanner terminalpv1 = new Scanner(System.in);
        System.out.println("Digite a nota da prova 1: ");
        prova1 = terminalpv1.nextFloat();

        Scanner terminalpv2 = new Scanner(System.in);
        System.out.println("Digite a nota da prova 2: ");
        prova2 = terminalpv2.nextFloat();

        Scanner terminalTf = new Scanner(System.in);
        System.out.println("Digite a nota do Trabalho Final: ");
        trabalhoFinal = terminalTf.nextFloat();

        // Váriaveis trabalhos
        float trabalhoun1;
        float trabalhoun2;
        float trabalhoun3;
        float trabalhoun4;
        float trabalhoun5;
        float trabalhoun6;
        float trabalhoun7;

        Scanner terminalT1 = new Scanner(System.in);
        System.out.println("Digite a nota do prova 1: ");
        trabalhoun1 = terminalpv1.nextFloat();
        
        Scanner terminalT2 = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho 2: ");
        trabalhoun2 = terminalT2.nextFloat();

        Scanner terminalT3 = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho 3: ");
        trabalhoun3 = terminalT3.nextFloat();

        Scanner terminalT4 = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho 4: ");
        trabalhoun4 = terminalT4.nextFloat();

        Scanner terminalT5 = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho 5: ");
        trabalhoun5 = terminalT5.nextFloat();

        Scanner terminalT6 = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho 6: ");
        trabalhoun6 = terminalT6.nextFloat();

        Scanner terminalT7 = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho 7: ");
        trabalhoun7 = terminalT7.nextFloat();

        // Cálculos de Média Aritmética / Ponderada
        float mediaTrabalhos = (trabalhoun1 + trabalhoun2 + trabalhoun3 + trabalhoun4 + trabalhoun5 + trabalhoun6 + trabalhoun7) / 7;
        float mediaFinal = (prova1 * 0.2f) + (prova2 * 0.3f) + (trabalhoFinal * 0.3f) + (mediaTrabalhos * 0.2f);

        // Médias Aluno
        System.out.println("A média final do semestre é igual a: " + mediaFinal);
        System.out.println("A média final dos trabalhos é igual a: " + mediaTrabalhos);
    }
}
