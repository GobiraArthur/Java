package conversor;

import java.util.Scanner;

public class Conversor {
	
	//declaração de variaveis 
	
	private float a;
	Scanner sc = new Scanner(System.in);
	// metodos 
	
	public void cel_far () {
		
		System.out.println("Digite a tempertatura em Celcius: ");
        a = sc.nextFloat();
        System.out.println("A temperatura em Fahrenheit é "+ (a*1.8+32) );
		
	}
	public void far_cel () {
		
		System.out.println("Digite a tempertatura em Fahrenheit: ");
        a = sc.nextFloat();
        System.out.println("A temperatura em Celcius é "+ ((a-32)/1.8) );
		
	}
	// metodo main
	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		Scanner sc = new Scanner(System.in);
		String sn;
		
		//menu
		do {
		System.out.println("Qual conversão você deseja fazer?");
		System.out.println("1. Celcius para Fahrenheits");
		System.out.println("2. Fahrenheits para Celcius");
		int choice = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha pendente
		if (choice==1) {
			conversor.cel_far();
		}
		if (choice ==2) {
			conversor.far_cel();
		}
		System.out.println("Deseja fazer outro calculo? (s/n)");
        sn = sc.nextLine();
		}while(!sn.equals ("n"));
	} 
}
