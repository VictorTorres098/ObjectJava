package excepciones;

import java.util.Scanner;

/**
 * @author victor
 * En el bloque try estan las instrucciones que podrian generar un problema, en este
 * caso, la division (si el divisor es 0).
 * El bloque catch "atrapa" la excepcion, si se intenta divider por cero, entonces, se
 * captura esa excepcion y, en este caso, se muestra el mensaje. Si se efectua una
 * una division que no tenga inconvenientes, entoces, el catch no actua.
 * 
 * ArithmeticException es el tipo de excepcion que ocurrio, cuando ocurre, se crea un
 * objeto en este caso exception.
 */
public class Excepciones {

	public static void main(String[] args) {
		//intenta dividir por 0 !!
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num1,num2, division;
		
		System.out.println("primer numero, debe ser un valor entero");
		num1 = scanner.nextInt();
		System.out.println("Division, un valor entero");
		num2 = scanner.nextInt();
		try {
			division = num1/num2;
			System.out.println(division);}
		catch(ArithmeticException exception) {
			System.err.println("Se intento dividir por cero");
		}
		try {
			@SuppressWarnings("unused")
			Fecha fecha = new Fecha(1,-1200,1999);}
			catch(Exception e) {
				System.err.println("No son valores validos para una fecha");
			}
	}
		
}
	/**
	 *A los bloques try/catch se le puede agregar el bloque 
	 *finally, que es la opcion es decir, no es obliatorio utilizarlo.
	 *El finally se ejecuta siempre, si no ocurre una excepcion y no
	 *entra al catch, si se ejecuta el finally. Si ocurriera una 
	 *excepcion y el catch la "atrapa", tambien se ejecuta el finally.
	 */	
//}
