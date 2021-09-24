package patrones.factory;


public class Piedra extends PiedraPapelTijeraFactory {
	

	
	
	public Piedra() {
		 numero=0;
		 nombre="piedra";
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero==0;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedra) {
		//resultado o emapta
		//resultado 1 gana
		//resultado -1 pierde
		
		//si viene una piedra 0, empata
		//si viene papel 1, pierde
		//si viene tijera 2, gana
		
		int resultado=0;
		
		switch(pPiedra.numero) {
		case 0:
			resultado=0;
			descripcion="Emapatamos";
			break;
		case 1:
			resultado=-1;
			descripcion="Piedra perdió con "+ pPiedra.getNombre();
			break;
		case 2:
			resultado=1;
			descripcion="Piedra le ganó a "+ pPiedra.getNombre();
			break;
		default:
			break;	
		}
		return resultado;
	}
}
