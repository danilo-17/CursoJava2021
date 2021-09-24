package patrones.factory;

public class Tijera extends PiedraPapelTijeraFactory {

	public Tijera() {
		numero=2;
		 nombre="tijera";
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero==2;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedra) {
	int resultado=0;
		
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
