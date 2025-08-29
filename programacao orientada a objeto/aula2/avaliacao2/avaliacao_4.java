package aula2.avaliacao2;
import java.text.Normalizer;
import java.util.Scanner;

public class avaliacao_4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("digite uma string: ");

        String str = scanner.nextLine();

        String low = str.toLowerCase();

        String semesp = low.replaceAll("[^a-z0-9]", "");

        String strpronta = removeAcentos(semesp);

        boolean ehpalindromo = true;
        int i = 0;
        int j = strpronta.length() - 1;


        while (i < j) {
            if(strpronta.charAt(i) != strpronta.charAt(j)) {
                ehpalindromo = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("string original: " +str);
        System.out.println("string limpa:" +strpronta);
        System.out.println("e palindromo: " +ehpalindromo);


    }

    /**
     * Remove todos os acentos/diacríticos de uma string.
     */
    public static String removeAcentos(String input) {
        if(input == null) return null;
        return Normalizer.normalize(input, Normalizer.Form.NFD)
            .replaceAll("\\p{M}", "");
    }

}
