package aula2.avaliacao2;
import java.util.Scanner;


public class avaliacao {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);


         int numeroInteiro;

         float numeroFlutuante;

         String nomeComposto;

         System.out.println("Digite um inteiro, um ponto flutuante e um nome composto, separados por tabulações:");


         // introduza seu código aqui
         String linha = scanner.nextLine();

         String [] partes = linha.split("\t");

         numeroInteiro = Integer.parseInt(partes[0]);

         numeroFlutuante = Float.parseFloat(partes[1]);
         
         nomeComposto = partes[2];


         System.out.println("Você digitou o inteiro: " + numeroInteiro);
         System.out.println("Você digitou o ponto flutuante: " + numeroFlutuante);
         System.out.println("Você digitou o nome composto: " + nomeComposto);
         scanner.close();

     }
}
