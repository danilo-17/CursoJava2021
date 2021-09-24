package es.com.manpower.notas.modelo.util.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.com.manpower.notas.modelo.util.DateUtil;

public class DateUtilTest {
	
	Date fecha;

	@Before
	public void setUp() throws Exception {
		Calendar cal=Calendar.getInstance();
		cal.set(1972, Calendar.NOVEMBER, 17);
		fecha=cal.getTime();
	}

	@After
	public void tearDown() throws Exception {
		fecha=null;
	}

	@Test
	public void testGetAnio() {
		assertEquals(1972, DateUtil.getAnio(fecha));
	}

}
