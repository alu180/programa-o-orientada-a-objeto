package aula2.avaliacao2;

import java.util.Scanner;

public class avaliacao_2 {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.println("digite uma string:");
         String texto = scanner.nextLine();

         int ultimoIndice = -1;

         for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                ultimoIndice = i;
            }
         }

         if (ultimoIndice != -1) {
            System.out.println("ultima vogal encontrada no indice: " + ultimoIndice);
         } else {
            System.out.println("vogal nao encontrada");
         }




         scanner.close();

     }



}
