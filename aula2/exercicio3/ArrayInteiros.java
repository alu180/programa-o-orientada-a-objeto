import java.util.Scanner;

public class ArrayInteiros {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 5 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print(" Números armazenados no array:");
        for (int num : numeros) {
            System.out.print(num);
        }

        scanner.close();




    }

}

