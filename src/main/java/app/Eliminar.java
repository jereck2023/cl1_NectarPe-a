package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Empleado;

public class Eliminar {
	public static void main(String[] args) {
			//Establecer conexion
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
				//Manejador de entidades
				EntityManager em = fabrica.createEntityManager();
				
				//transaccion
				em.getTransaction().begin();
				
				//Objeto con el Empleado a eliminar
				Empleado e = new Empleado();
				e.setId_empleado("EMP0004");
				em.persist(e);
				//FROM...WHERE
				em.remove(e);
				
				System.out.println("Registro Eliminado!");
				em.getTransaction().commit();
				
				//cerrar la conexion
				em.close();
	}
}
