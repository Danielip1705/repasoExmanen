package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		char letra;
		Scanner sc = new Scanner(System.in);
		Criptograma.desordenaAbecedario();
		Criptograma.eligeFrase();
		Criptograma.codificaFrase();

		do {
			System.out.println(Criptograma.fraseCodificada);
			System.out.println("Inserte el codigo que quieras cambiar");
			codigo = sc.nextInt();
			sc.nextLine();
			System.out.println("Inserte el caracter que creas que es");
			letra = sc.next().charAt(0);
			if (Criptograma.compruebaCodigo(codigo, letra)) {
				System.out.println("Has acertado");
			} else {
				System.out.println("Incorrecto");
			}
		} while (!Criptograma.sonIguales());
		System.out.println("FELICIDADES, HAS GANADO :D");
		sc.close();
	}
}
