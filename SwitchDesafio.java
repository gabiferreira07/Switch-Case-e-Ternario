package abril3;

import java.util.Scanner;

public class SwitchDesafio {

	public static void main(String[] args) {
		double salario, bonus;
		Scanner ler = new Scanner(System.in);
		int tempo;
		
		System.out.print("Informe o salário: ");
		salario = ler.nextDouble();

	    System.out.print("Informe o tempo de empresa: ");
	    tempo = ler.nextInt();
	        
	    switch (tempo) {
	    case 1:
	    case 2:
	    case 3:
	    	bonus = salario * 0.05;
	    	break;
	    default:
	    	bonus = salario * 0.07;
	    }
	    System.out.println("O bônus recebido é de: " + bonus);
	     
	}

}
