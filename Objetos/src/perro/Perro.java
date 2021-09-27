package perro;

public class Perro {
	private static int num;		//variable de clase no de objeto
	private Integer cantidadPatas;
	private String nombre;
	
	public Perro() {
		
	}
	public static int consultarCantPerro() {
		//algo que ya esta implicito en la clase 
		//por ejemplo el nombre cientifico de los perros solo exite uno para todos los perros
		return num; //ilegalisimo
	}
	public String toString() {
		return nombre+""+cantidadPatas.toString();
	}
	///exepcion
	
}
