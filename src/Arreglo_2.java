
public class Arreglo_2 {

	public static void main(String[] args) {
		String[] nombres;
		nombres = new String[3];
		
		nombres[0]="Juan Perez";
		nombres[1]="Antonio Lopez";
		nombres[2]="Santiago Herrera";
		
		for(int indice = 0; indice<nombres.length; indice ++) {
			System.out.println("indice: "+ indice + " " + nombres[indice]);
		}
		
		
		System.out.println();
		System.out.println();
		
		String[] nombres2 = {"Joel", "Edgar", "Omar", "Tomas", "David", "Elena", "Rosa", "Ulises"};
		
		for(int indice = 0; indice<nombres2.length; indice ++) {
			System.out.println("indice: "+ indice + " " + nombres2[indice]);
		}

	}

}
