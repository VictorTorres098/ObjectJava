package herencia;

import java.util.ArrayList;

public abstract class Mesa {
	private Integer codigo;
	private String tipoMesa;
	private Integer cupo;
	private Persona presidenteDeMesa;
	private ArrayList listaDeTurnos;
	
	public Mesa(Integer codigo, String tipoMesa, Integer cupo) {
		
	}
	public abstract void designarPresidente(Persona presidenteDeMesa);
	
	public abstract void agregarTurno(Turno turno);

}
