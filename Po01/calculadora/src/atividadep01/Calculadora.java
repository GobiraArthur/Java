package atividadep01;

import java.util.Scanner;

public class Calculadora {
	//Declaração de variaveis

    private float a, b;
    Scanner sc = new Scanner(System.in);
    
    //Metodos da calculadora

    public void soma() {
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextFloat();
        System.out.println("O valor da soma é: " + (a + b));
    }

    public void multiplica() {
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextFloat();
        System.out.println("O valor da multiplicação é: " + (a * b));
    }

    public void divide() {
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextFloat();
        System.out.println("O valor da divisão é: " + (a / b));
    }

    public void subtrai() {
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextFloat();
        System.out.println("O valor da subtração é: " + (a - b));
    }
    //Metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sn;
        int choice;

        Calculadora calculadora = new Calculadora();
        // Menu de escolhas 
        do {
            System.out.println("--------MENU--------\n");
            System.out.println("");
            System.out.println("Escolha uma operação:\n");
            System.out.println("");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            choice = sc.nextInt();

            sc.nextLine(); // Consumir a quebra de linha pendente


            if (choice == 1) {
                calculadora.soma();
            }
            if (choice == 2) {
                calculadora.subtrai();
            }
            if (choice == 3) {
                calculadora.multiplica();
            }
            if (choice == 4) {
                calculadora.divide();
            }

            System.out.println("Deseja fazer outro calculo? (s/n)");
            sn = sc.nextLine();
        } while (!sn.equals("n"));
        System.out.println("Fim do Programa!!!!!!!!!");
    }
}