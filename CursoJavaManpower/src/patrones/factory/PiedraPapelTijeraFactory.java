package patrones.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {
	
	private static List<PiedraPapelTijeraFactory> elementos;
	protected String nombre;
	protected int numero;
	protected String descripcion;

	public PiedraPapelTijeraFactory() {
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public static PiedraPapelTijeraFactory getInstance(int pNumero) {
		
		elementos=new ArrayList<PiedraPapelTijeraFactory>();
		
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		
		for (PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			if (piedraPapelTijeraFactory.isMe(pNumero)) {
				return piedraPapelTijeraFactory;
			}
		}
		return null;
	}
	
	public abstract boolean isMe(int pNumero);
	
	public abstract int comparar (PiedraPapelTijeraFactory pPiedra);

}
