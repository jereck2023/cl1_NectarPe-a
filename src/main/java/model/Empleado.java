package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;


@Entity
@Table(name = "tb_empleado")
public class Empleado {
	@Id
	private String id_empleado;
	@Column(length = 25)
	private String apellido;
	@Column(length = 15)
	private String nombre;
	private int edad;
	private char sexo;	 
	private double salario;
	 
	 
	 
	public Empleado() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", apellido=" + apellido + ", nombre=" + nombre + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}



	public Empleado(String id_empleado, String apellido, String nombre, int edad, char sexo, double salario) {
		super();
		this.id_empleado = id_empleado;
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	public String getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	 
	 
}
