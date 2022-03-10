package br.com.armazenar;

import java.util.Scanner;

public class Remover {
	void remover() {
		Scanner leia = new Scanner(System.in);
		
		
		int num1, num2;
		
		System.out.println("---Estoque de Produtos---");
		System.out.println("   1- Maça");
		System.out.println("   2- Pera");
		System.out.println("   3- Uva");
		System.out.println("   4- Melão");
		System.out.println("   5- Pitaia");
		System.out.println("-------------------------");
		
		System.out.println("Deseja remover algo do estoque? ");
		System.out.println("[1] Sim | [2] Não");
		System.out.print("---> ");
		num1 = leia.nextInt();
		
		
		switch (num1) {
		
		case 1:
			System.out.println("Qual item? [1][2][3][4][5]");
			System.out.print("---> ");
			num2 = leia.nextInt();
			System.out.println(); 
				if (num2 == 1 ) {
					System.out.println("  Estoque atualizando... ");
					System.out.println("-------------------------");
					System.out.println("---Estoque de Produtos---");
					System.out.println("   1- Pera");
					System.out.println("   2- Uva");
					System.out.println("   3- Melão");
					System.out.println("   4- Pitaia");
					System.out.println("-------------------------");
				}
				else if (num2 == 2) {
					System.out.println("  Estoque atualizando... ");
					System.out.println("-------------------------");
					System.out.println("---Estoque de Produtos---");
					System.out.println("   1- Maça");					
					System.out.println("   2- Uva");
					System.out.println("   3- Melão");
					System.out.println("   4- Pitaia");
					System.out.println("-------------------------");
				}
				else if (num2 == 3) {
					System.out.println("  Estoque atualizando... ");
					System.out.println("-------------------------");
					System.out.println("---Estoque de Produtos---");
					System.out.println("   1- Maça");
					System.out.println("   2- Pera");				
					System.out.println("   3- Melão");
					System.out.println("   4- Pitaia");
					System.out.println("-------------------------");
				}
				else if (num2 == 4) {
					System.out.println("  Estoque atualizando... ");
					System.out.println("-------------------------");
					System.out.println("---Estoque de Produtos---");
					System.out.println("   1- Maça");
					System.out.println("   2- Pera");
					System.out.println("   3- Uva");
					System.out.println("   4- Pitaia");
					System.out.println("-------------------------");
				}
				else if (num2 == 5) {
					System.out.println("  Estoque atualizando... ");
					System.out.println("-------------------------");
					System.out.println("---Estoque de Produtos---");
					System.out.println("   1- Maça");
					System.out.println("   2- Pera");
					System.out.println("   3- Uva");
					System.out.println("   4- Melão");
					
					System.out.println("-------------------------");
				}
			break;
		
		case 2:
			System.out.println("Nenhum produto foi removido do estoque...");
			System.out.println("-------------------------");
			System.out.println("---Estoque de Produtos---");
			System.out.println("   1- Maça");
			System.out.println("   2- Pera");
			System.out.println("   3- Uva");
			System.out.println("   4- Melão");
			System.out.println("   5- Pitaia");
			System.out.println("-------------------------");
		break;
		}
		leia.close();
	}
}
