package patrones.factory.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import patrones.factory.Papel;
import patrones.factory.Piedra;
import patrones.factory.PiedraPapelTijeraFactory;
import patrones.factory.Tijera;

public class PiedraPapelTijeraFactoryTest {
	
	PiedraPapelTijeraFactory piedra;
	PiedraPapelTijeraFactory papel;
	PiedraPapelTijeraFactory tijera;

	@Before
	public void setUp() throws Exception {
		
		piedra=new Piedra();
		papel=new Papel();
		tijera=new Tijera();
	}
	

	@After
	public void tearDown() throws Exception {
		piedra=null;
		papel=null;
		tijera=null;
	}
	@Test
	public void testComparaPiedraPierdePapel(){
		assertEquals(-1, piedra.comparar(papel));
		assertEquals("Piedra perdió con papel", piedra.getDescripcion());
	}

	@Test
	public void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(0) instanceof Piedra);		
	}
	
	@Test
	public void testGetInstancePapel() {
		
		assertTrue(PiedraPapelTijeraFactory.getInstance(1) instanceof Papel);
		
	}

	@Test
	public void testGetInstanceTijera() {
		
		assertTrue(PiedraPapelTijeraFactory.getInstance(2) instanceof Tijera);
		
	}

	

}
