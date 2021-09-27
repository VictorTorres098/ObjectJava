package strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class StringBulAndIterator {

	public static void main(String[] args) {
		//En las clases vector(arrayList, hashSet, treeSet
		List personas = new ArrayList();
		personas.add("juan");
		personas.add("pepe");
		personas.add("Olga");
		
		Iterator it = personas.iterator();
		
		while(it.hasNext()) {
			String unaPersona = (String) it.next();
		}
		//en las clases hashmap, treemap
		
		SortedMap sm = new TreeMap();
		sm.put(3, "intruccion");
		sm.put(2, 5);
		Iterator iterador = sm.entrySet().iterator();
		
		while(iterador.hasNext()) {
			Object claveValor = iterador.next();
			System.out.println("Clave = valor : "+claveValor);
		}
		
		//bucles forEach
		for(Object nombre: personas) {
			System.out.println(nombre);
		}
		//Iterador metodo remove
		Iterator<String> itA = personas.iterator();
		while(itA.hasNext()) {
			String nombre = itA.next();
			if(nombre.equals("juan")) {
				itA.remove();
			}
		}
		for(Object nombre: personas) {
			System.out.println(nombre);
		}
		

	}

}
