package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Empleado;

public class Actualizar {

	public static void main(String[] args) {
		//Establecer conexion
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		//Manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		
		//transaccion
		em.getTransaction().begin();
		
		//Objeto con el Empleado a modificar
		//Empleado e = new Empleado("EMP0001", "AlCANTARA", "ISABEL", 21, 'F', 1600.0);
		Empleado e = new Empleado("EMP0002", "MONTIEL", "HUGO", 28, 'M', 2400.0);
		
		em.persist(e);
		System.out.println("Registro Actualizado!");
		em.getTransaction().commit();
				
		//cerrar la conexion
		em.close();
	}

}
