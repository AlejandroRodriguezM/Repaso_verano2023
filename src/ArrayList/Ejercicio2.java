package ArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int tamanioLista = 0;
		String respuesta;
		boolean estadoPrograma = false;

		while (!estadoPrograma) {
			try {
				System.out.print("Como quieres que sea el tamanio del arrayList?: ");
				tamanioLista = ent.nextInt();
				ent.nextLine();

				ArrayList<Integer> listaGenerada = generarArray(tamanioLista);

				System.out.print("\nContenido de la lista: " + listaGenerada.toString());

				System.out.print("\nSuma total: " + sumaLista(listaGenerada));

				System.out.print("\nQuieres repetir? S/N: ");
				respuesta = ent.nextLine();

				if (respuesta.equalsIgnoreCase("N")) {
					System.out.println("Has salido del programa.");
					estadoPrograma = true;
				} else {
					System.out.println("Repitiendo programa . . . " + "/n");
					estadoPrograma = false;
				}

			} catch (InputMismatchException ex) {
				System.err.println("ERROR. HAS INTRODUCIDO UN CARACTER INVALIDO.");
				ent.next();
			}
		}
		ent.close();

	}

	/**
	 * Funcion que crea un arraList de un tamaño X, el arraylist es rellenado con numeros enteros aleatorios
	 * @param tamanioLista
	 * @return
	 */
	public static ArrayList<Integer> generarArray(int tamanioLista) {

		Random random = new Random();
		ArrayList<Integer> listaT = new ArrayList<Integer>();

		for (int i = 0; i < tamanioLista; i++) {
			int numRandom = random.nextInt(100);
			listaT.add(numRandom);
		}

		return listaT;

	}

	/**
	 * Funcion que devuelve un numero entero que es la suma del contenido del arrayList
	 * @param lista
	 * @return
	 */
	public static int sumaLista(ArrayList<Integer> lista) {

		int sumaTotal = 0;

		for (int i = 0; i < lista.size(); i++) {
			sumaTotal += lista.get(i);
		}

		return sumaTotal;

	}
}
