package br.com.armazenar;

import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Armazenar arm = new Armazenar();
		Remover rem = new Remover();
		
		int num1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---Estoque de Produtos---");
		System.out.println("   1- Maça");
		System.out.println("   2- Pera");
		System.out.println("   3- Uva");
		System.out.println("   4- Melão");
		System.out.println("   5- Pitaia");
		System.out.println("-------------------------");
		
		System.out.println("[1] Armazenar");
		System.out.println("[2] Remover  ");
		System.out.println("[3] Atualizar");
		System.out.print("---> ");
		num1 = leia.nextInt();
		
		switch (num1) {
			
			case 1:
				arm.armazenar();
			break;
			
			case 2:
				rem.remover();
			break;
		}
		leia.close();
	}

}
