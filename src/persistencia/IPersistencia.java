package persistencia;

import java.io.IOException;

public interface IPersistencia  <E>{
	 void abrirInput(String nombre) throws IOException;

	 void abrirOutput(String nombre) throws IOException;

	 void cerrarOutput() throws IOException;

	 void cerrarInput() throws IOException;

	 void escribir(E objeto) throws IOException;
	    
	 E leer() throws IOException, ClassNotFoundException;
}
