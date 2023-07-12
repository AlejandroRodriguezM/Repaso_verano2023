package ArrayList;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println(palabraLarga(listaGenerado(3)));
		
	}
	
	public static ArrayList<String> listaGenerado(int tamanioLista){
		ArrayList<String> listaPalabras = new ArrayList<String>();
		if(tamanioLista < 5 && tamanioLista >= 0) {
			listaPalabras.add("Vaya");
			listaPalabras.add(" prueba ");
			listaPalabras.add("es ");
			listaPalabras.add(" esta");

		}else {
			listaPalabras.add("Esto");
			listaPalabras.add(" es ");
			listaPalabras.add(" un_ ");
			listaPalabras.add(" ejercicio ");
			listaPalabras.add("aburrido");
		}
		return listaPalabras;
	}
	
	public static String palabraLarga(ArrayList<String> listaPalabras) {
	
		String palabraLarga = "";
		
		for (int i = 0; i < listaPalabras.size(); i++) {
	
			if(listaPalabras.get(i).length() >= palabraLarga.length()) {
				palabraLarga = listaPalabras.get(i);
			}
		}
		
		return palabraLarga;
		
	}
	
}
