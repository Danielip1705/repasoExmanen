package examen3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ops;
		int fila;
		int columna;
		String usuario="";
		
		Golosinas.rellenarMatriz(5);
		
		do {
			System.out.println("1. Mostrar golosinas");
			System.out.println("2. Pedir golosina");
			System.out.println("3. Rellenar golosinas");
			System.out.println("4. Apagar Maquina");
			ops = sc.nextInt();
			
			switch(ops) {
			case 1:
				Golosinas.mostrarGolosinas();
				break;
			case 2:
				System.out.println("Fila que quieres de la golosina");
				fila = sc.nextInt();
				sc.nextLine();
				System.out.println("Columna que quieres de la golosina");
				columna = sc.nextInt();
				sc.nextLine();
				if(Golosinas.hayValorPosicion(fila, columna)) {
				System.out.println("Hay existensias, añadiendo a ventas");	
				Golosinas.anyadirVenta(fila, columna);
				Golosinas.reducirPosicion(fila, columna, 1);
				} else {
					System.out.println("No hay existensias");
				}
				break;
			case 3:
				System.out.println("Inserte la contraseña del administrador");
				usuario = sc.next();
				if(usuario.equals("Maquina2023")) {
					System.out.println("Inserte la fila");
					fila = sc.nextInt();
					sc.nextLine();
					System.out.println("Inserte la columna");
					columna = sc.nextInt();
					sc.nextLine();
					if(Golosinas.validarPos(fila, columna)) {
						System.out.println("Hay existensias, añadiendo a ventas");
						Golosinas.aumentarPosicion(fila, columna, 1);
					} else {
						System.out.println("Posicion incorrecta");
					}
				}
				break;
			case 4:
				Golosinas.imprimirVentasTotales();
				break;
			}
		}while(ops!=5);
	}

	

}
