package p02;
import java.util.Scanner;
import java.util.Random;


public class Adivinhação {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int a = random.nextInt(101);
		int x;
		
		do {
			System.out.println("Digite um inteiro entre 0 e 100");
			x = sc.nextInt();
			if (x > a) {
				System.out.println("Muito alto");
			}
			if (x<a){
				System.out.println("Muito baixo");
			}
			if (x == a) {
				System.out.println("Acertou Miseravi");
			}
		}while (x != a);
		
		System.out.println(x);
	}
}
