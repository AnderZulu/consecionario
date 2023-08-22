package logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//creacion de la clase principal consecionario.
public class Concesionario {
	
	private Auto auto=new Auto();
	private Moto moto=new Moto();
	
	//Arraylist de estado de vehiculos (vendido / disponible)
	public static ArrayList<Vehiculo> vehiculos_disponibles=new ArrayList<Vehiculo>();
	public static ArrayList<Vehiculo> vehiculos_vendidos=new ArrayList<Vehiculo>();
	
	//Metodo agregar vehiculo en arraylist.
	public void agrega_vehiculo(int tipo) {
			if(tipo==1){
				
				//toma de datos del vehiculo
				String placa=JOptionPane.showInputDialog("digite el numero de la placa");
				String referencia=JOptionPane.showInputDialog("digite el numero de referencia");
				String marca=JOptionPane.showInputDialog("digite la marca de su vehiculo");
				String modelo=JOptionPane.showInputDialog("digite el modelo del vehiculo");
				int numPuertas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de puertas"));
				int numRuedas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de Ruedas"));
				boolean gasolina=Boolean.valueOf(JOptionPane.showInputDialog("¿es a gasolina?"));
				int precio=Integer.parseInt(JOptionPane.showInputDialog("digite el valor del vehiculo"));	
				
			    auto.setMarca(marca);  
			    auto.setPlaca(placa);  
			    auto.setReferencia(referencia);
			    auto.setModelo(modelo); 
			    auto.setNum_puertas(numPuertas); 
			    auto.setNum_ruedas(numRuedas);		
			    auto.setIs_gasolina(gasolina); 
			    auto.setPrecio(precio);
			    
			    //agregar vehiculo
			    vehiculos_disponibles.add(auto);
			    
		   }else {
			
			//toma de datos del vehiculo
			String placa=JOptionPane.showInputDialog("digite la placa");
			String referencia=JOptionPane.showInputDialog("digite la referencia");
			String marca=JOptionPane.showInputDialog("digite la marca");
			String modelo=JOptionPane.showInputDialog("digite el modelo");
			int numRuedas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de Ruedas"));
			int cilindraje=Integer.parseInt(JOptionPane.showInputDialog("digite el cilindraje de la moto"));
			double tamTanque=Double.parseDouble(JOptionPane.showInputDialog("digite el tamano del tanque"));
			int precio=Integer.parseInt(JOptionPane.showInputDialog("digite el valor del vehiculo"));
			
			moto.setMarca(marca);moto.setPlaca(placa);moto.setReferencia(referencia);
			moto.setModelo(modelo);moto.setNum_ruedas(numRuedas);moto.setCilindraje(cilindraje);
			moto.setTam_tanque(tamTanque);moto.setPrecio(precio);
			
			//agregar vehiculo
			vehiculos_disponibles.add(moto);
		}
		
	}
	
	//Metodo buscar vehiculo mediante placa - Vendidos - Disponibles
	public void buscar_vehiculo() {
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Buscar en vehiculos disponibles "
				+ "\n2. Buscar en vehiculos vendidos "));
		String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas buscar");
		
		
		if(opcion==1) {
			for(int i=0;i<vehiculos_disponibles.size();i++) {
				if(vehiculos_disponibles.get(i).getPlaca().equals(dato)) {
					JOptionPane.showMessageDialog(null,vehiculos_disponibles.get(i).toString());
				}else {
					JOptionPane.showMessageDialog(null,"Vehiculo no esta registrado o ya se vendio");
				}
			}
		}else {
			for(int i=0;i<vehiculos_vendidos.size();i++) {
				if(vehiculos_vendidos.get(i).getPlaca().equals(dato)) {
					JOptionPane.showMessageDialog(null,vehiculos_vendidos.get(i).toString());
				}else {
					JOptionPane.showMessageDialog(null,"vehiculo no encontrado");
				}
			}
		}
	}
	
	//metodo elaborado para vender vehiculo
	public void vender_vehiculos() {
		String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas vender");
		for(int i=0;i<vehiculos_disponibles.size();i++) {
			if(vehiculos_disponibles.get(i).getPlaca().equals(dato)) {
				vehiculos_vendidos.add(vehiculos_disponibles.get(i));
				vehiculos_disponibles.remove(i);
			}else {
				JOptionPane.showMessageDialog(null,"Vehiculo no encontrado");
			}
		}
	}
	
	//metodo mostrar vehiculos disponibles
	public void mostrar_disponibles() {
		for(int i=0;i<vehiculos_disponibles.size();i++) {
			System.out.println(i+". "+vehiculos_disponibles.toString());
		}
	}
	
	//metodo para mostrar la cantidad de vehiculos
	public void cantidades() {
		int cantidad_motos=0; int cantidad_autos=0;
		int cantidad_vendidos=0; int cantidad_disponibles=0;
		
		for(int i=0;i<vehiculos_disponibles.size();i++) {
			if(vehiculos_disponibles.size()==0) {
				
			}else {
				cantidad_disponibles++;
				if(vehiculos_disponibles.get(i).getClass().equals(auto.getClass())) {
					cantidad_autos++;
				}else if(vehiculos_disponibles.get(i).getClass().equals(moto.getClass())) {
					cantidad_motos++;
				}
			}
		}
		for(int j=0;j<vehiculos_vendidos.size();j++) {
			if(vehiculos_vendidos.size()==0) {
				
			}else {
				cantidad_vendidos++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "cantidad de vehiculos disponibles: "+cantidad_disponibles+"\n"
				+ "cantidad de autos: "+cantidad_autos+"\ncantidad de motos: "+cantidad_motos+
				"\ncantidad de vehiculos vendidos: "+cantidad_vendidos);
	}
	
	//Total de ventas 
	public void total_ventas() {
		int total=0;
		for(int i=0;i<vehiculos_vendidos.size();i++) {
			if(vehiculos_vendidos.size()==0) {
				JOptionPane.showMessageDialog(null, "No hay vehiculos vendidos");
			}else {
				total+=vehiculos_vendidos.get(i).getPrecio();
				JOptionPane.showMessageDialog(null, "El total de ventas a sido de: "+total);
			}
		}
	}
	
	//metodo elaborado para la eliminacion de vehiculos guardados
	public void eliminar_vehiculo() {
		String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas eliminar");
		for(int i=0;i<vehiculos_disponibles.size();i++) {
			if(dato.equals(vehiculos_disponibles.get(i).getPlaca())) {
				vehiculos_disponibles.remove(i);
			}else {
				JOptionPane.showMessageDialog(null, "Vehiculo no encontrado");
			}
		}
	}
	
	//metodo menu con funciones switch y posibles casos
	public void menu() {
		int opcion=9;
			while (opcion!=0) {
				opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Añadir Vehiculo."+
						"\n2. Buscar Vehiculo."+"\n3. Vehiculos disponibles."+"\n4. Vender vehiculo"+
								"\n5. Ver cantidades."+"\n6. Ver ventas totales"+
						"\n7. Eliminar vehiculos"+"\n0. Salir"));
				switch (opcion) {
				case 1:
					int tipo=Integer.parseInt(JOptionPane.showInputDialog("1. Carro"+"\n2. Moto"));
					agrega_vehiculo(tipo);
					break;
				case 2:
					buscar_vehiculo();
					break;
				case 3:
					mostrar_disponibles();
					break;
				case 4:
					vender_vehiculos();
					break;
				case 5:
					cantidades();
					break;
				case 6:
					total_ventas();
					break;
				case 7:
					eliminar_vehiculo();
					break;
				case 0: 
					break;
			}
		}
	}
}
