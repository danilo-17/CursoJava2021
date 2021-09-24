package patrones.factory;

public class Papel extends PiedraPapelTijeraFactory {

	public Papel() {
		
		numero=1;
		 nombre="papel";
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero==1;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedra) {
	int resultado=0;
	
	//cambiar la clase papel
		
		switch(pPiedra.numero) {
		case 0:
			resultado=1;
			break;
		case 1:
			resultado=0;
			break;
		case 2:
			resultado=-1;
			break;
		default:
			break;	
		}
		return resultado;
	}

}
