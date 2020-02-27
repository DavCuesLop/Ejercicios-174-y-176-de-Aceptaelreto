package _176;

import java.util.Scanner;

public class _176 {
	public static void main(String[] args) {
		//Este es el ejercicio 176, introduces el ancho y el alto del tablero,se va introduciendo signo a signo y sale el resultado que se pide
		Scanner tec = new Scanner(System.in);

		int ancho = tec.nextInt();
		int alto = tec.nextInt();
		String[][] vector = new String[alto][ancho];
		tec.nextLine();
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				vector[i][j] = tec.nextLine();
			}
		}
		System.out.println(totalGuionesCon6MinasOMas(vector));

	}

	public static int totalGuionesCon6MinasOMas(String[][] vector) {
		int cont = 0;
		int cont_total = 0;

		for (int i = 1; i < vector.length - 1; i++) {
			for (int j = 1; j < vector[0].length - 1; j++) {
				cont = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					for (int k2 = j - 1; k2 <= j + 1; k2++) {
						if (vector[i][j].equals("-") && vector[k][k2].equals("*")) {
							cont++;
						}
					}
				}
				if (cont >= 6) {
					cont_total++;
				}
			}
		}
		return cont_total;
	}
}