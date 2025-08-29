package aula2.avaliacao2;

import java.util.Scanner;

public class avaliacao_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite uma string:");
        
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        
        String stringInvertida = String.valueOf(charArray);
        System.out.println("a sua string invertida e: " +stringInvertida);
    }

}
