package logica;

//clase moto que hereda de vehiculo sus estructuras
public class Moto extends Vehiculo {
	
	private int cilindraje;
	private double tamano_tanque;
	public Moto() {
		
	}

	//metodo construtor
	public Moto(String placa, String marca, String referencia, String modelo, int num_ruedas, int cilindraje, double tam_tanque,int precio) {
		super(placa, marca, referencia, modelo, num_ruedas,precio);
		this.cilindraje = cilindraje;
		this.tamano_tanque = tam_tanque;
	}


	//Metodos getter y setter
	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	public double getTam_tanque() {
		return tamano_tanque;
	}
	public void setTam_tanque(double tam_tanque) {
		this.tamano_tanque = tam_tanque;
	}

	
	@Override
	public void queSoy() {
		// TODO Auto-generated method stub
		System.out.println("soy una moto");
	}

	//metodo to string para tomar los datos almacenados en el getter
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "marca: "+ getMarca() +"\nplaca: "+getPlaca()+"\nreferencia: "+getReferencia()+"\nmodelo: "+getModelo()+"\nnumero de ruedas: "+getNum_ruedas()+
				"\ncilindraje: "+cilindraje+"\ntamaño del tanque: "+tamano_tanque+"\nPrecio: "+getPrecio();
	}
}
