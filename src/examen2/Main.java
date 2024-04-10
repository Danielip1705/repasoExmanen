package examen2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char letra;
		String palabra ="";
		Scanner sc = new Scanner(System.in);
		
		Ahorcado.generaPalabra();
		
		System.out.println(Ahorcado.palabraPista);
		
		do {
			
			Ahorcado.menu();
			
			if(Ahorcado.menu()==1) {
				System.out.println("Inserte caracter:");
				letra = sc.next().charAt(0);
				Ahorcado.compruebaLetra(letra);
			} else if (Ahorcado.menu()==2) {
				System.out.println("Inserte palabra: ");
				palabra = sc.nextLine();
				Ahorcado.compruebaPalabra(palabra);
			}
			System.out.println(Ahorcado.palabraPista);
			
			System.out.println(Ahorcado.NUMINTENTOS);
			
		}while(!Ahorcado.palabraPista.equals(Ahorcado.palabraSecreta));
		
		System.out.println("ENHORABUENA!! HAS ACERTADO");
	}

}
