package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
	
	HelloWorld cronometro = new HelloWorld ();
	@Test
	public void testreiniciar(){
	assertEquals(cronometro.getSegundos(), cronometro.reiniciar());
	}
}
