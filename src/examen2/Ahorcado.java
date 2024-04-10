package examen2;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	public static String[] palabras = {
		"humanidad","persona","hombre","mujer","individuo","cuerpo"
		,"pierna","cabeza","brazo","familia"
	};
	
	public static final int NUMINTENTOS =7;
	
	public static String palabraSecreta;
	
	public static String palabraPista="";
	
	public static String noAcertadas;
	
	public static void generaPalabra() {
		palabraSecreta = palabras[rand.nextInt(palabras.length)];
	}
	
	public static int menu() {
		int ops;
		System.out.println("Selecciones una de las siguientes opciones");
		System.out.println("Introducir letra");
		System.out.println("Introducir palabra");
		ops = sc.nextInt();
		sc.nextLine();
		return ops;
	}
	
	public static void compruebaLetra(char letra) {
		char letraMinus = Character.toLowerCase(letra);
		boolean acierto=false;
		for(int i =0;i<palabraSecreta.length();i++) {
			if(palabraSecreta.charAt(i) == letraMinus) {
				palabraPista+=letraMinus;
				acierto = true;
			} else {
				palabraPista+="-";
			}
			
			if(!acierto) {
			noAcertadas+= letraMinus+" ";
			}
		}
	}
	
	public static void compruebaPalabra(String cadena) {
		
		String cadMinus=cadena.toLowerCase();
		
		if(cadMinus.equals(palabraSecreta)) {
			palabraPista = cadMinus;
		}
		
	}
	
	public void pintaPista() {
		System.out.println("Palabras no acertadas: " + noAcertadas);
		System.out.println(palabraPista);
		
		
	}
}
