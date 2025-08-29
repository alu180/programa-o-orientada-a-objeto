package aula2.exercicio1;

import java.util.Scanner;

public class EntradaBasica {
    public static void main(String[] args) {


        System.out.print("digite o seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.print("digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ola " + nome + ",voce tem " + idade + " anos");
        scanner.close();



    }

}
