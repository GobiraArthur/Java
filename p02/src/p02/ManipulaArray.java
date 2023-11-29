package p02;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {

    public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do array:");
        int tamanho = scanner.nextInt();
        
        int[] array = new int[tamanho];
        
        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Gera números aleatórios até 99
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;

        for (int elemento : array) {
            soma += elemento;
        }

        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];

        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }

        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];

        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        return menor;
    }

    public static void main(String[] args) {
        int[] arrayUsuario = criarArrayDoUsuario();
        int[] arrayAleatorio = criarArrayAleatorio(5);

        System.out.println("\nArray do Usuário:");
        imprimirArray(arrayUsuario);

        System.out.println("\nArray Aleatório:");
        imprimirArray(arrayAleatorio);

        System.out.println("\nSoma do Array do Usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Maior valor do Array do Usuário: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor do Array do Usuário: " + encontrarMenorValor(arrayUsuario));
    }

    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
