package tecnologiaJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//iterador con Stringbuilder
public class Iteradores {
	
	public static void main(String[] args) {
//		ArrayList<String> lista = new ArrayList<>();
//		lista.add("Auto");
//		lista.add("Camion");
//		lista.add("Lancha");
//		lista.add("Avioneta");
//		
//		System.out.println(listaAString(lista));

		//recorrer
		//arreglo estatico -> podemos recorrer de cualquier modo
		//listas enlazada ->  el ger es O(n) entonces preferimos iteradores
		//Conjunto -> no tiene posicion entonces solo se puede usar Iteradores.
		
		//borrar elementos
		//SOLO ITERADORES!!!!!
		
		List<String> lista1 = new ArrayList<>(
				Arrays.asList("auto","lancha","auto","auto","cammion")
				);//crea una array list con esos elementos
		System.out.println(lista1);
		
//		for(int i = 0; i < nums.size(); i++) {
//			if(nums.get(i).equals("auto")) {
//				nums.remove(i);
//			}
//		} esto no funciona!!!
		
		//recorrer for each
		//esto trae problemas ya que con for each no es lo mejor para editar
//		for(String s: lista1) {
//			if(s.equals("auto")) {
//				lista.remove(s);
//			}
//		}
		
		//iteradores fue diseñado para modificar y editar listas
		Iterator<String> it = lista1.iterator();
		while(it.hasNext()) {
			if(it.next().equals("auto"))
				it.remove();
		}
		
		//si quisiera trabajar sobre las variables o cuando queremos usar mas de una vez ese elemento
		while(it.hasNext()) {
			String palabra = it.next();
			if(palabra.equals("auto") || palabra.length() > 10)
				it.remove();
		}
		
		System.out.println(lista1);
		
		//con diccionario no se puede recorrer facilmente
		Map<String, Integer> diccionario = new HashMap<>();
		diccionario.keySet(); // devuelve un conjunto de claves
		diccionario.values(); // devuelve las variables
		diccionario.entrySet();
		
	}
	
	public static String listaAString(List<String> lista) {
		StringBuilder sb = new StringBuilder();
		sb.append("LISTA:\n");
		sb.append("--------\n");
		
		for(String item: lista) {
			sb.append("  - ").append(item).append("\n");    
			//no usar el operador + con string builder ya que estariamos desperdiciando las ventajas del String Builder		
		}
		return sb.toString(); //importante por ultimo convertirlo en String
	}
}
