
public class Arreglo_3 {

	public static void main(String[] args) {
		int []numeros; // Declaramos
		numeros = new int[7]; // Estamos Creando
		
		// NO Necesariamente se necesita llevar un orden
		// Agregando valores a cada una de las posiciones de los arreglos
		numeros[0]=(1+1);
		numeros[1]=(2+2);
		numeros[2]=(3+3);
		numeros[3]=(4+4);
		
		// Asignando variables a cada posicion del arreglo 
		int i = numeros[0];
		int j = numeros[1];
		int k = numeros[2];
		int l = numeros[3];
		
		// Podemos hacer Operaciones con los variables de los arreglos
		
		int r = (i+j);
		int m = (k*i);
		int suma = (r+m);
		
		numeros[4] =r+1;
		numeros[5] =m;
		numeros[6] =suma;
		
		
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);
		System.out.println("Valor de r: " + r);
		System.out.println("Valor en posicion [4]: r+1  " + numeros[4]);
		System.out.println("Valor en posicion [5]:  m  " + numeros[5]);
		System.out.println("Valor en posicion [6]: r+m  " + numeros[6]);
		
		
		
		//for(int indice = 0; indice<numeros.length; indice ++) {
			//System.out.println("indice: "+ indice + " " + numeros[indice]);
		//}
		
		
		
		
		

	}

}
