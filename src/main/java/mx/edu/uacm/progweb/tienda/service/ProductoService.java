package mx.edu.uacm.progweb.tienda.service;

import mx.edu.uacm.progweb.tienda.dao.ProductoDAO;
import mx.edu.uacm.progweb.tienda.dominio.Producto;

import java.util.List;

public class ProductoService {
    
    ProductoDAO dao = new ProductoDAO();

    public boolean registrarProducto(int clave, String nombre, Double precio, int cant) {



        /**
		 * Logica del negocio
		 * - Reglas de negocio
		 * - filtrado de informacion
		 * - tratamiento de informacion
		 */
        return dao.registrar(clave, nombre, precio, cant);
        
    }

    public Producto consultarProducto(int clave, String nombre) {

        return dao.consultar(clave, nombre);
        
    }

    public List<Producto> consultarProductosTodos() {
		
		//TODO realizar logica del negocio
		
		return dao.consultarTodos();
	}

}
