
public class Arreglo_1 {

	public static void main(String[] args) {
		// Declarar un Arreglo
		// <Tipo Dato>[]<nombre del Arreglo>
		// Sintaxis
		int[] numeros;
		
		// vamos crearlo y darle un valor
		numeros = new int[6];
		
		// Asignando valores al arreglo
		numeros[0]=45;
		numeros[1]=78;
		numeros[2]=80;
		numeros[3]=45;
		numeros[4]=455;
		numeros[5]=100;
		
		//System.out.println(numeros[4]);
		for(int indice = 0; indice<numeros.length; indice ++) {
			System.out.println("indice: "+ indice + " " +numeros[indice]);
		}
		
		System.out.println();
		System.out.println();
		//****************///
		int [] numeros2 = {45, 78, 80, 100, 56, 89, 69, 58, 122};
		//System.out.println(numeros2[5]);
		
		
		for(int indice = 0; indice<numeros2.length; indice ++) {
			System.out.println("indice: "+ indice + " " +numeros2[indice]);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
