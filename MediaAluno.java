import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int NUM_ALUNOS = 10;
        double[] notas = new double[NUM_ALUNOS];


        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }


        double soma = 0;
        for (int i = 0; i < NUM_ALUNOS; i++) {
            soma += notas[i];
        }
        double media = soma / NUM_ALUNOS;


        System.out.println("A média das notas é: " + media);

        int acimaMedia = 0;
        int abaixoMedia = 0;
        for (int i = 0; i < NUM_ALUNOS; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            } else if (notas[i] < media) {
                abaixoMedia++;
            }
        }


        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        System.out.println("Quantidade de notas abaixo da média: " + abaixoMedia);


    }
}
