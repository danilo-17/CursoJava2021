package es.com.manpower.notas.modelo.dao.selectStrategy;

public class EstudiosStrategy extends SelectStrategy {

	@Override
	public String getCondicion() {
		StringBuilder sb=new StringBuilder(" where alu_estudios like '%");
		sb.append(alumno.getEstudios());
		sb.append("%'");
		return sb.toString();
	}

	@Override
	public boolean isMe() {
		this.tengoWhere=alumno.getEstudios() != null &&
				!alumno.getEstudios().isEmpty();
		return alumno.getEstudios() != null;
	}

}
