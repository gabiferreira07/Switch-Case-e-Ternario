package abril3;

import java.util.Scanner;

public class SwitchSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha um dia da semana de domingo a sábado:");
		String dia = ler.next();
		
		switch (dia) {
		case "Domingo":
			System.out.println("O dia escolhido foi 1.");
			break;
		case "Segunda-feira.":
			System.out.println("O dia escolhido foi 2.");
			break;
		case "Terça-feira":
			System.out.println("O dia escolhido foi 3.");
			break;
		case "Quarta-feira":
			System.out.println("O dia escolhido foi 4.");
			break;
		case "Quinta-feira":
			System.out.println("O dia escolhido foi 5.");
			break;
		case "Sexta-feira":
			System.out.println("O dia escolhido foi 6.");
			break;
		case "Sábado":
			System.out.println("O dia escolhido foi 7.");
			break;
		default:
			System.out.println("O dia escolhido é inválido! Digite novamente.");
		}

	}

}
