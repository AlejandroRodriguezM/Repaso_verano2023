package ArrayList;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Suma de elementos en un array
 * 
 * @author alejandroRM
 *
 */

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int numArray = 0;
		String opcion;
		boolean datoCorrecto= false;
		
		while(!datoCorrecto) {
			System.out.println("Dime el tamanio del array: ");
			try {
				numArray = ent.nextInt();
				int[] array = arrayRandom(numArray);
				
				ent.nextLine();
		        System.out.println("Array original: " + Arrays.toString(array));
		        
		        int[] arrayInverso = arrayReves(array);
		        System.out.println("Array modificado: " + Arrays.toString(arrayInverso));
				
				System.out.println("Quieres continuar? S/N");
				opcion = ent.nextLine();
				
				if(opcion.equalsIgnoreCase("S")) {
					datoCorrecto = false;
				}else {
					datoCorrecto = true;
				}
            } catch (InputMismatchException ex) {
				System.err.println("Debes de introducir un numero entero");
				ent.next();
			}
		}
		ent.close();
	}
	
	/**
	 * Crea un array de X numeros random segun el argumento introducido
	 * @param numArray
	 * @return
	 */
    public static int[] arrayRandom(int numArray) {
        int[] array = new int[numArray];
        Random random = new Random();

        for (int i = 0; i < numArray; i++) {
            int numRandom = random.nextInt(25);
            array[i] = numRandom;
        }

        return array;
    }
	
    /**
     * Segun el array introducido, devuelve el array pero al reves
     * @param array
     * @return
     */
    public static int[] arrayReves(int[] array) {
        int[] arrayTemporal = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            arrayTemporal[i] = array[array.length - 1 - i];
        }
        
        return arrayTemporal;
    }
}
