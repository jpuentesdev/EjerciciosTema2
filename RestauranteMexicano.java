package tema2.EjerciciosPropuestos11;

public class RestauranteMexicano {

	// atributos 
	int clientes;
	double kilosPapas;
	double kilosChocos;
	
	// constructor
	public RestauranteMexicano(int clientes, double kilosPapas, double kilosChocos) {
		this.clientes = clientes;
		this.kilosPapas = kilosPapas;
		this.kilosChocos = kilosChocos;
	}
	
	// métodos
	public void addPapas(double cantidad) {
		kilosPapas += cantidad;
	}
	
	public void addChocos(double cantidad) {
		kilosChocos += cantidad;
	}
	
	public void calcularClientes(){
		
		while (kilosPapas >= 1.0/3 && kilosChocos >= 0.5/3) {
			kilosPapas -= 1.0/3;
			kilosChocos -= 0.5/3;
			clientes ++;
		}
		
	}
	
	public void getComensales() {
		System.out.println("El restaurante puede atender a "+clientes+" clientes");
	}
	
	public void showPapas() {
		System.out.println("En el almacen hay "+kilosPapas+" kg de papas");
	}
	
	public void showChocos() {
		System.out.println("En el almacen hay "+kilosChocos+" kg de chocos");
	}
	
	public static void main(String[] args) {
		
		RestauranteMexicano miRestaurante = new RestauranteMexicano(0,1,1);
		

		miRestaurante.getComensales();
		miRestaurante.calcularClientes();
		miRestaurante.getComensales();
	}
} 
