package _174;

import java.util.Scanner;


public class _174 {
	//Este es el ejercicio 174, introduces un año y te saca el resultado que se pide
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int num = tec.nextInt();

		boolean estaRepe = hayRepes(String.valueOf(num));
		boolean estaRepeV2 = estaRepe;
		int numV2 = num;
		int anyoMenor = -1;

		while (estaRepeV2 == estaRepe) {
			estaRepeV2 = hayRepes(String.valueOf(numV2));
			if (estaRepeV2 == estaRepe) {
				numV2--;
				anyoMenor++;
			}
		}

		numV2 = num;
		estaRepeV2 = estaRepe;
		int anyoMayor = 0;

		while (estaRepeV2 == estaRepe) {
			estaRepeV2 = hayRepes(String.valueOf(numV2));
			if (estaRepeV2 == estaRepe) {
				numV2++;
				anyoMayor++;
			}
		}
		int primerAnyo = num - anyoMenor;
		int longSerie = anyoMayor + anyoMenor;
		System.out.println(primerAnyo + " " + longSerie);
	}

	public static boolean hayRepes(String num) {
		for (int i = 0; i < num.length() - 1; i++) {
			for (int j = i + 1; j < num.length(); j++) {
				if (num.charAt(i) == num.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
