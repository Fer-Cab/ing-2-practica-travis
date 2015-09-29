package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Cronometro;

public class CronometroTest {
	
	Cronometro cronometro = new Cronometro ();
	@Test
	public void testReiniciar(){
		cronometro.reiniciar();
	assertEquals(0,cronometro.getSegundos() );
	assertEquals(0,cronometro.getMinutos() );
	}
	
	@Test
	public void testIncrementarTiempo(){
	for(int i=0 ; i < 61 ; i++){
		cronometro.incrementarTiempo();
	}
	assertEquals(0,cronometro.getSegundos() );
	assertEquals(1,cronometro.getMinutos() );
	}
	
	@Test
	public void testMostrarTiempo(){
	cronometro.incrementarTiempo();
	assertEquals("minutos = 0 segundos = 1",cronometro.mostrarTiempo());
	}
	

	
}
