package criacional.factory;

import java.util.Scanner;

public class TesteFactory {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Correio correio;
		Integer opcaoCorreio;

		do {

			System.out.println("\nOpções de entrega de correios \n");
			System.out.println("\n1 - Terrestre");
			System.out.println("\n2 - Aéreo");
			System.out.println("\n0 - Sair");

			opcaoCorreio = sc.nextInt();

			switch (opcaoCorreio) {
			case 1:
				correio = new CorreioTerrestre();
				correio.planejarEntrega();
				break;

			case 2:
				correio = new CorreioAereo();
				correio.planejarEntrega();
				break;

			default:
				break;
			}

		} while (opcaoCorreio != 0);
		
		sc.close();
	}
}
