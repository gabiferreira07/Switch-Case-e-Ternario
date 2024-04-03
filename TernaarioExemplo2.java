package abril3;

import java.util.Scanner;

public class TernaarioExemplo2 {

	public static void main(String[] args) {
		String nome1, nome2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um nome: ");
		nome1 = ler.next(); 
		
		System.out.println("Informe outro nome: ");
		nome2 = ler.next(); 
		
		System.out.println(nome1.equals(nome2) ? "Igual":"Diferente");

	}

}
