package abril3;

import java.util.Scanner;

public class IfDesafio {

	public static void main(String[] args) {
		double salario, tempo, bonus;
		Scanner ler = new Scanner(System.in);
		
		System.out.println ("Informe o salário: ");
		salario = ler.nextDouble();
		
		System.out.println ("Informe o tempo de empresa: ");
		tempo = ler.nextDouble();
		
		if (tempo >= 3) {
			bonus = salario * 0.05; 
		}
		else {
			bonus = salario * 0.07;
		}
		System.out.println("O bônus é de: " + bonus);

	}

}
