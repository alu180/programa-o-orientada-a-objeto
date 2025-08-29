import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        System.out.print("insira quantas provas voce fez: ");

        Scanner scanner = new Scanner(System.in);

        int numeroProvas = scanner.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= numeroProvas; i++) {
            System.out.print("Digite a nota da prova " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / numeroProvas;

        System.out.printf("A média das notas é: %.2f", media);



    }

}


