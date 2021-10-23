package mx.edu.uacm.progweb.tienda.conf.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

public class ConexionDBTest {
	
	@Test
	public void debeObtenerConexionaBD() {
		System.out.println(">Entrando al método debeObtenerConexionaBD <");
		Connection con = ConexionDB.obtenerConexion();
		
		//Aserciones, son confirmaciones, aseveraciones
		//afrima que el objeto conexión no es nulo
		//More Unit
		//CTRL + r
		assertNotNull(con);
	}
}