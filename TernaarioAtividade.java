package abril3;

import java.util.Scanner;

public class TernaarioAtividade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota1, nota2, nota3, nota4, media;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = ler.nextInt();
		
		System.out.print("Informe a segunda nota: ");
		nota2 = ler.nextInt();
		
		System.out.print("Informe a terceira nota: ");
		nota3 = ler.nextInt();
		
		System.out.print("Informe a quarta nota: ");
		nota4 = ler.nextInt();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média é: " + media);
		
		String mensagem = media >= 6 ? "Aprovado" : "Reprovado";
		System.out.println(mensagem); 

	}

}
