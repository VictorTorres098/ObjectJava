package strings;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Iterator;

public class PracticaString {

	public static void main(String[] args) {
		System.currentTimeMillis();
		System.out.println(separarMiles("12345678"));

	}
	public static String separarMiles(String numero) {
		StringBuilder sb = new StringBuilder(numero);
		//formato mil(##.###.###)
		Integer contFinal = sb.length();
		contFinal -= 3;
		sb.insert(contFinal, ".");
		contFinal -= 3;
		sb.insert(contFinal, ".");
		String newNumero = "";
		newNumero = sb.substring(0);
		return newNumero;
	}

}
