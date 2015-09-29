package uk.co.placona.helloWorld;

public class Cronometro {

//Cada cronometro debe almacenar 2 variables internas. Una para segundos y otra para minutos.
//Cuando se superan los 60 segundos, se debe incrementar en 1 la cantidad de minutos transcurridos
private int segundos , minutos ;

// Reiniciar (que pone el contador en cero)	
public void reiniciar(){
	segundos = minutos = 0;
}

// IncrementarTiempo (que avanza el cronometro en 1 segundo)
public void incrementarTiempo(){
	if (segundos == 60 ) 
		{
			segundos = 0;
			minutos += 1;
		}
		else segundos += 1;
}

// MostrarTiempo (que muestra el tiempo que pasó en minutos y segundos: Ejemplo 5 minutos, 3 segundos)
public String  mostrarTiempo(){
	return  minutos+ " minutos " + segundos+" segundos";
	
}

public int getSegundos(){
	return segundos;
}

public int getMinutos(){
	return minutos;
}

}
