package es.com.manpower.notas.modelo.dao.selectStrategy;

public class NombreStategy extends SelectStrategy {

	@Override
	public String getCondicion() {
		StringBuilder sb=new StringBuilder(" where alu_nombre like '%");
		sb.append(alumno.getNombre());
		sb.append("%'");
		return sb.toString();
	}

	@Override
	public boolean isMe() {
		this.tengoWhere=alumno.getNombre() != null &&
				!alumno.getNombre().isEmpty();
		return alumno.getNombre() != null;
	}

}
