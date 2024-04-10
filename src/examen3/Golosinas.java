package examen3;

public class Golosinas {
	public static String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };

	public static double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 } };

	public static int[][] cantidad = new int[4][4];

	public static String[] ventas = new String [50];

	public static double total;
	
	public static void rellenarMatriz(int num) {
		for(int i =0;i<cantidad.length;i++) {
			for(int j =0;j<cantidad[i].length;j++) {
				cantidad[i][j] =num;
			}
		}
	}

	public static void mostrarGolosinas() {
		for (int i = 0; i < Golosinas.nombresGolosinas.length; i++) {

			for (int j = 0; j < Golosinas.nombresGolosinas[i].length; j++) {

				// Calcular la cantidad de espacios necesarios para centrar el nombre
				int espacios = 20 - Golosinas.nombresGolosinas[i][j].length();

				// Imprimir el nombre con los espacios necesarios
				System.out.print(i + "" + j + "\t" + Golosinas.nombresGolosinas[i][j]);

				for (int k = 0; k < espacios; k++) {

					System.out.print(" ");
				}
				// Imprimir el precio
				System.out.print("Precio: " + Golosinas.precio[i][j]);

				// Saltar a la siguiente línea
				System.out.println();
			}
		}
	}

	public static boolean validarPos(int fila, int columna) {
		boolean valido = false;
		int i = 0;
		int j = 0;

		while (i < Golosinas.nombresGolosinas.length && valido != true) {
			i++;
			while (j < Golosinas.nombresGolosinas[i].length && valido != true) {
				j++;
				if (i == fila && columna == j) {
					valido = true;
				}
			}
		}
		return valido;
	}

	public static boolean hayValorPosicion(int fila, int columna) {
		boolean valido = false;
		int i = 0;
		int j = 0;

		while (i < Golosinas.nombresGolosinas.length && valido != true) {
			i++;
			while (j < Golosinas.nombresGolosinas[i].length && valido != true) {
				j++;
				if (Golosinas.cantidad[i][j] > 0) {
					valido = true;
				}
			}
		}

		return valido;
	}

	public static void aumentarPosicion(int fila, int columna, int cantidad) {
		boolean valido = false;
		int i = 0;
		int j = 0;

		while (i < Golosinas.nombresGolosinas.length && valido != false) {
			i++;
			while (j < Golosinas.nombresGolosinas[i].length && valido != false) {
				j++;
				if (i == fila && columna == j) {
					Golosinas.cantidad[i][j] += cantidad;
					valido = true;
				}
			}
		}
	}

	public static void reducirPosicion(int fila, int columna, int cantidad) {
		boolean valido = false;
		int i = 0;
		int j = 0;

		while (i < Golosinas.nombresGolosinas.length && valido != false) {
			i++;
			while (j < Golosinas.nombresGolosinas[i].length && valido != false) {
				j++;
				if (i == fila && columna == j) {
					Golosinas.cantidad[i][j] -= cantidad;
					valido = true;
				}
			}
		}
	}
	
	public static void anyadirVenta(int fila, int columna) {
		String nombre = Golosinas.nombresGolosinas[fila][columna];
	    double precio = Golosinas.precio[fila][columna];
	    
	    // Sumar el precio de la golosina al total de ventas
	    Golosinas.total += precio;
	    
	    // Buscar la primera posición nula en la tabla de ventas
	    int i = 0;
	    while (i < Golosinas.ventas.length && Golosinas.ventas[i] != null) {
	        i++;
	    }
	    
	    // Añadir el nombre de la golosina a la tabla de ventas si hay espacio
	    if (i < Golosinas.ventas.length) {
	        Golosinas.ventas[i] = nombre;
	    }
		
	}
	
	public static void imprimirVentasTotales() {
		int espacio=10;
		
		for(int i =0;i<Golosinas.ventas.length;i++) {
			
			espacio=10 - Golosinas.ventas[i].length();
			
			System.out.print(Golosinas.ventas);
			
			for(int j =0;j< espacio;j++) {
				
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
