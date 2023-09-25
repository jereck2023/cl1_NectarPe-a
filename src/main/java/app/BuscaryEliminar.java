package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Empleado;

public class BuscaryEliminar {
	
	public static void main(String[] args) {
		//Establecer conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		//Manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		
		Empleado e = em.find(Empleado.class, "EMP0005");
		
		if (e == null)
			System.out.println("Usuario no fue encontrado");
		else {
			System.out.println("Usuario encontrado");
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			System.out.println("Registro eliminado");
		}
		//cerrar la conexion
		em.close();	
	}
}
