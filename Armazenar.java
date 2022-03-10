package br.com.armazenar;

import java.util.Scanner;

public class Armazenar {
	void armazenar() {
		Scanner leia = new Scanner (System.in);
		
		String item1;
		int num1;
		
		System.out.println("---Estoque de Produtos---");
		System.out.println("   1- Maça");
		System.out.println("   2- Pera");
		System.out.println("   3- Uva");
		System.out.println("   4- Melão");
		System.out.println("   5- Pitaia");
		System.out.println("-------------------------");
		
		System.out.println("Deseja armazenar algo no estoque? ");
		System.out.println("[1] Sim | [2] Não");
		System.out.print("---> ");
		num1 = leia.nextInt();
		
		switch (num1) {
		
			case 1:
				System.out.print("Qual item? ");
				item1 = leia.next();
				System.out.println();
				System.out.println("Atualizando o estoque...");
				System.out.println("------------------------");
				System.out.println("---Estoque de Produtos---");
				System.out.println("   1- Maça");
				System.out.println("   2- Pera");
				System.out.println("   3- Uva");
				System.out.println("   4- Melão");
				System.out.println("   5- Pitaia");
				System.out.println("   6- " + item1);
				System.out.println("-------------------------");
				break;
			
			case 2:
				System.out.println("Estoque não atualizado...");
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
