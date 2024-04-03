package abril3;

import java.util.Scanner;

public class TernaarioAtividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.print("Informe um valor: ");
		a = ler.nextInt();
		
		String mensagem = a % 5 == 0 ? "O número é multiplo de 5" : "O número não é multiplo de 5.";
		System.out.println(mensagem); 

	}

}
