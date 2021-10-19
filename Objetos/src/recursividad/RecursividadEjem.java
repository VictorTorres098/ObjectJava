package recursividad;

public class RecursividadEjem {
	int [] array = {1,2,3,4,5};
	
	public static void main(String[] args) {
		
	}
	
	public static int sumarElementos(int [] num, int longitud) {
		if(longitud == 0) {
			return num[longitud];
		}else {
			return num[longitud] + sumarElementos(num, longitud-1);
		}
	}
	public int busquedaBinaria(int [] num, int inicio, int fin, int valor) {
		int pivote = inicio+(fin-inicio)/2;
		if(num[pivote] == valor) {
			return pivote;
		}
		if(inicio == fin) {
			return -1;
		}
		if(num[pivote] < valor) {
			return busquedaBinaria(num, pivote+1, fin, valor);
		}else {
			return busquedaBinaria(num, inicio, pivote-1, valor);
		}
	}
	
}
