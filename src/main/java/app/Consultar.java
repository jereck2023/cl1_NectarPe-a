package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Empleado;

public class Consultar {
	
	public static void main(String[] args) {
		//Establecer conexion
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
				//Manejador de entidades
				EntityManager em = fabrica.createEntityManager();
				
				//Consulta
				//Empleado e = em.find(Empleado.class, "EMP0004"); //Usuario no encontrado
				Empleado e = em.find(Empleado.class, "EMP0001");
				
				if (e == null) 
					System.out.println("Usuario no encontrado");
				else {
					System.out.println("Usuario encontrado");
					System.out.println(e);
				}
				//cerrar la conexion
				em.close();		
	}
	
}
