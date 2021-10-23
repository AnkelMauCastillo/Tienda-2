package mx.edu.uacm.progweb.tienda.dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProductoDAOTest {
	
	@Test
	public void debeRegistrarProducto() {
		// TODO Auto-generated method stub
		
		System.out.println("> Entrando a debeRegistrarProducto");
		ProductoDAO dao = new ProductoDAO();
		
		boolean estaInsertadoRegistro = dao.registrar(45, "Red", Double.valueOf("55"), 8);
		
		assertTrue(estaInsertadoRegistro);

	}

}
