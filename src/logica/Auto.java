package logica;

//clase auto que hereda de vehiculo sus estructuras
public class Auto extends Vehiculo {
	
	private int numero_puertas;
	private boolean is_gasolina;
	
	public Auto() {
		
	}
	
	//Metodo constructor.
	public Auto(String placa, String marca, String referencia, String modelo, int num_ruedas,int num_puertas, boolean is_gasolina,int precio) {
		super(placa, marca, referencia, modelo, num_ruedas,precio);
		this.numero_puertas = num_puertas;
		this.is_gasolina = is_gasolina;
	}

	
    //Metodos getter y setter
	public int getNum_puertas() {
		return numero_puertas;
	}
	public void setNum_puertas(int num_puertas) {
		this.numero_puertas = num_puertas;
	}
	public boolean isIs_gasolina() {
		return is_gasolina;
	}
	public void setIs_gasolina(boolean is_gasolina) {
		this.is_gasolina = is_gasolina;
	}


	@Override
	public void queSoy() {
		// TODO Auto-generated method stub
		System.out.println("soy un carro");
	}


    //Metodo elaborado para tomar los datos almacenados del getter
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "marca: "+ getMarca() +"\nplaca: "+getPlaca()+"\nreferencia: "+getReferencia()+"\nmodelo: "+getModelo()+"\nnumero de ruedas: "+getNum_ruedas()+
				"\numero de puertas: "+getNum_puertas()+"\nes a gasolina?: "+is_gasolina+"\nPrecio: "+getPrecio();
	}
}
