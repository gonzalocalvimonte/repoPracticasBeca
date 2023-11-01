package clase3;

import java.util.Arrays;

public class ejercicio1b {
	
	public static void main(String[] args) {
		int numeros[] = new int[3];
		String orden = "descendente";
		numeros[0] = 35;
		numeros[1] = 8;
		numeros[2] = 17;
		int numerosOrdenados[] = new int[3];
		int valorMaximo = 0;
		int valorMinimo = 0;
		
		if(orden.equals("ascendente")) {
			
			for (int i = 0; i < numeros.length; i++) {
				
				if(i == 0) {
					valorMaximo = numeros[i];
					valorMinimo = numeros[i];
				} else {
					
					if(numeros[i] > valorMaximo && numeros[i] > valorMinimo){
						valorMaximo = numeros[i];
					} else if(numeros[i] < valorMaximo && numeros[i] < valorMinimo){
					valorMinimo = numeros[i];
					}else {
					numerosOrdenados[1] = numeros[i];
					}
				}
					
			}
				numerosOrdenados[0] = valorMinimo;
				numerosOrdenados[2] = valorMaximo;
				System.out.println(Arrays.toString(numerosOrdenados));
		
				
		}else if (orden.equals("descendente")) {
			
			for (int i = 0; i < numeros.length; i++) {
				
				if(i == 0) {
					valorMaximo = numeros[i];
					valorMinimo = numeros[i];
				} else {
					
					if(numeros[i] > valorMaximo && numeros[i] > valorMinimo){
						valorMaximo = numeros[i];
					} else if(numeros[i] < valorMaximo && numeros[i] < valorMinimo){
					valorMinimo = numeros[i];
					}else {
					numerosOrdenados[1] = numeros[i];
					}
				}
					
			}
				numerosOrdenados[2] = valorMinimo;
				numerosOrdenados[0] = valorMaximo;
				System.out.println(Arrays.toString(numerosOrdenados));
		
		
		
	}
	
}
	}
