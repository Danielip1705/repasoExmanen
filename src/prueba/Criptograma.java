package prueba;

import java.util.Random;

public class Criptograma {

	static Random rand = new Random();

	public static char[][] abecedario = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
			{ 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q' }, { 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }

	};

	public static String[] frases = {
			"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien", "cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida", "la verdadera sabiduria esta en reconocer la propia ignorancia"

	};

	public static String fraseReal = "";

	public static String fraseCodificada = "";

	public static void desordenaAbecedario() {

		for (int i = 0; i < abecedario.length; i++) {
			for (int j = 0; j < abecedario[i].length; j++) {

				int a = rand.nextInt(abecedario[i].length);

				char temp = abecedario[i][j];

				abecedario[i][j] = abecedario[i][a];
				abecedario[i][a] = temp;
				temp = abecedario[i][a];
			}
		}
	}

	public static void eligeFrase() {
		fraseReal = frases[rand.nextInt(frases.length)];
	}

	public static void codificaFrase() {
		for (char a : fraseReal.toCharArray()) {
			if (a == ' ') {
				fraseCodificada += "  ";
			} else {
				for (int i = 0; i < abecedario.length; i++) {
					for (int j = 0; j < abecedario[i].length; j++) {

						if (a == abecedario[i][j]) {
							fraseCodificada += i + "" + j + " ";
						}
					}
				}
			}
		}
	}

	public static boolean compruebaCodigo(int codigo, char letra) {

		boolean valido = false;

		String codigoCad = "";

		int fila = codigo / 10;

		int columna = codigo % 10;

		if (codigo <= 9) {

			codigoCad = "0" + String.valueOf(codigo);

		} else {
			codigoCad = String.valueOf(codigo);
		}

		if (abecedario[fila][columna] == letra) {
			fraseCodificada= fraseCodificada.replaceAll(codigoCad, String.valueOf(letra));
			valido = true;
		}

		return valido;
	}

	public static boolean sonIguales() {
		boolean valido = false;

		if (fraseReal.replace(" ", "").equals(fraseCodificada.replace(" ", ""))) {
			valido = true;
		}
		return valido;
	}
}
