package abril3;

import java.util.Scanner;

public class TernaarioExemplo {

	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade = ler.nextInt();
		
		String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem); //Imprime "Maior de idade"
	}

}
