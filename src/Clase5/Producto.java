package Clase5;



public class Producto{
	
	// Atributos
	private String nombre;
	private String codigo;
	private float precio;
	
	
	//Constructor
	public Producto(String nombre, String codigo, float precio) {
	this.nombre = nombre;
	this.codigo = codigo;
	this.precio = precio;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	//otros metodos
	
	public float costoFinal() {
		return this.precio;
	}
	}

