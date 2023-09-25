package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Empleado;

public class Listar {
	public static void main(String[] args) {
		//Establecer conexion
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
				//Manejador de entidades
				EntityManager em = fabrica.createEntityManager();
				
				List<Empleado> lstEmpleados = em.createQuery("select e from Empleado e", Empleado.class).getResultList();
				System.out.println("Listado");
				for(Empleado e : lstEmpleados)
					System.out.println(e);
				
				//cerrar la conexion
				em.close();	
	}
}
