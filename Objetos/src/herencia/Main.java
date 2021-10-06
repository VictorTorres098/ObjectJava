package herencia;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		MesaComun Mesacomun = new MesaComun(null, null, null);
		MesaComun mesa2 = new MesaComun(null,null,null);
		
		ArrayList listaMesas = new ArrayList <>();
		listaMesas.add(Mesacomun);
		HashMap <Integer, ArrayList> franjaHoraria = new HashMap<>();
		franjaHoraria.put(1, listaMesas);
		franjaHoraria.get(1).add(mesa2);

	}

}
