package logica;

/*
 * clase vehiculo: 
 * una clase principal para el almacenamiento de datos;
 * los cuales seran usados en los objetos moto y Auto.
 */

public abstract class Vehiculo {
	private String placa;
	private String marca;
	private String referencia;
	private String modelo;
	private int num_ruedas;
	private int precio;
	
	public Vehiculo() {}
	
	//Metodo constructor
	public Vehiculo(String placa, String marca, String referencia, String modelo, int num_ruedas,int precio) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.referencia = referencia;
		this.modelo = modelo;
		this.num_ruedas = num_ruedas;
		this.precio=precio;
	}
	

    //metodo getter y setter
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNum_ruedas() {
		return num_ruedas;
	}
	public void setNum_ruedas(int num_ruedas) {
		this.num_ruedas = num_ruedas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public abstract void queSoy();
	public abstract String toString();


}
