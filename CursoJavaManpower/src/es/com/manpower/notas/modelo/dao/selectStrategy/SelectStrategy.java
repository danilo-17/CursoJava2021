package es.com.manpower.notas.modelo.dao.selectStrategy;

import es.com.manpower.notas.modelo.Alumno;

public abstract class SelectStrategy {
	
	protected boolean isUltimo;
	protected static String sql;
	protected boolean tengoWhere;
	protected Alumno alumno;
	
	
	public SelectStrategy() {
	}
	
	public static String getSql(Alumno palu) {
		return null;
	}

	public abstract String getCondicion();
	public abstract boolean isMe();
	
}
