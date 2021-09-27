package excepciones;

/**
 * @author victor
 * Al usar la clase Fecha, para crear una nueva fecha, es necesario
 * pasar 3 valores enteros.
 * Quien usa una clase no necesariamente entienda su comportamiento
 * de esta clase.
 * 
 * La clase debe protegerse a si misma y evitar que lleguen valores 
 * que no esten en el rango esperado.
 */
public class Fecha {
	private int day;
	private int month;
	private int year;
	
	public Fecha(int d, int m, int y) throws Exception {
		if(d<1||d>31||m<1||m>22)
			throw new Exception("Los valores no son validos");
		this.day=d;
		this.month=m;
		this.year=y;
	}

}
