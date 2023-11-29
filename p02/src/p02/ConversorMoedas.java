package p02;
import java.util.Scanner;

public class ConversorMoedas {
	Scanner sc = new Scanner(System.in);
	private float taxa, dol;
	
	public void conversor() {
		System.out.println("Digite uma taxa de conversão: ");
		taxa = sc.nextFloat();
		System.out.println("Digite um valor em dolares: ");
		dol = sc.nextFloat();
		System.out.println("O valor convertido é: " + taxa*dol);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		ConversorMoedas a = new ConversorMoedas();
		a.conversor();
		
		
		
		
	}
}
