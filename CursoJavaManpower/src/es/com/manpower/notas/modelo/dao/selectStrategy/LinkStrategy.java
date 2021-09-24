package es.com.manpower.notas.modelo.dao.selectStrategy;

public class LinkStrategy extends SelectStrategy {

	@Override
	public String getCondicion() {
		StringBuilder sb=new StringBuilder();
		if(tengoWhere) {
			sb.append(" and alu_estudios like '%");
			sb.append(alumno.getEstudios());
			sb.append("%'");
			sb.append(" and alu_linkgit like '%");
			sb.append(alumno.getLinkARepositorio());
			sb.append("%'");
		}else {
			sb.append(" where alu_estudios like '%");
			sb.append(alumno.getApellido());
			sb.append("%'");
			sb.append(" where alu_linkgit like '%");
			sb.append(alumno.getLinkARepositorio());
			sb.append("%'");
			tengoWhere=true;
		}
		return sb.toString();
	}

	@Override
	public boolean isMe() {
		return alumno.getLinkARepositorio() != null && !alumno.getLinkARepositorio().isEmpty();
	}

}
