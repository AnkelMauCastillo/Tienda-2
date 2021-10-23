package mx.edu.uacm.progweb.tienda.conf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	public static Connection con;
	public static String base_datos_nombre = "dc08id7940kkb0";
	public static String usuario = "uqogzshrejwjgh";
	public static String passw = "17ab8183055af0003b4dca2f08f0fa6bad9d509d1cbb138a813b45a1c29c0e36";
	public static String url = "jdbc:postgresql://ec2-52-21-193-223.compute-1.amazonaws.com:5432/" + base_datos_nombre;
	//More Unit
	//CTRL + J
	
	public static Connection obtenerConexion() {
		
		//me sirve para cargar el driver para la conexion de la bd 
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, passw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontro la clase");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Excepcion de SQL");
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void cerrar() {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			System.out.println("Error: No se logro cerrar la conexion: " + e);			
			
		}
	}
	
	
	

}