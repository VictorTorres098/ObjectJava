package tecnologiaJava;

import java.util.ArrayList;
import java.util.List;

//iterador con Stringbuilder
public class Iteradores {
	
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
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Auto");
		lista.add("Camion");
		lista.add("Lancha");
		lista.add("Avioneta");
		
		System.out.println(listaAString(lista));
	}
}
