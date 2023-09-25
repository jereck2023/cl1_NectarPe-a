package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Empleado;

public class Registrar {
//Registrar nuevo Empleado
	public static void main(String[] args) {
		//Establecer conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		//Manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		
		//transaccion
		em.getTransaction().begin();
		
		//Objeto con el nuevo empleado
		//Empleado e = new Empleado("EMP0005", "RAMIREZ", "PAUL", 25, 'M', 2300.0);
		Empleado e = new Empleado("EMP0006", "RODRIGUEZ", "LAURA", 20, 'F', 1500.0);
		//Insert into
		em.persist(e);
		System.out.println("Registro Insertado!");
		em.getTransaction().commit();
		
		//cerrar la conexion
		em.close();
	}
}
