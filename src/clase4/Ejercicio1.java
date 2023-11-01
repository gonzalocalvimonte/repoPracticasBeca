package clase4;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		ordenarNumeros(1,2,3,'a');
		
	}
	
	
	public static void ordenarNumeros(int numero1, int numero2, int numero3,char ordenamiento) {
		Scanner scn = new Scanner(System.in);
		
		
		int numeros[] = new int[3];
			System.out.println("Ingrese el numero 1");
		numeros[0] = scn.nextInt();
			System.out.println("Ingrese el numero 2");
		numeros[1] = scn.nextInt();
			System.out.println("Ingrese el numero 3");
		numeros[2] = scn.nextInt();
		
		char orden = ordenamiento;
		int numerosOrdenados[] = new int[3];
		int valorMaximo = 0;
		int valorMinimo = 0;
		
		if(orden == 'a') {
			
			for (int i = 0; i < numeros.length; i++) {
				
				if(i == 0) {
					valorMaximo = numeros[0];
					valorMinimo = numeros[0];
				} else {
					
					if(numeros[i] > valorMaximo ){
						numerosOrdenados[1] = valorMaximo;
						valorMaximo = numeros[i];
					} else if(numeros[i] < valorMinimo){
						numerosOrdenados[1] = valorMinimo;
						valorMinimo = numeros[i];
					}else {
						numerosOrdenados[1] = numeros[i];
					}
				}
					
			}
				numerosOrdenados[0] = valorMinimo;
				numerosOrdenados[2] = valorMaximo;
				System.out.println(Arrays.toString(numerosOrdenados));
		
				
		}else if (orden == 'd') {
			
			for (int i = 0; i < numeros.length; i++) {
				
				if(i == 0) {
					valorMaximo = numeros[0];
					valorMinimo = numeros[0];
				} else {
					
					if(numeros[i] > valorMaximo ){
						numerosOrdenados[1] = valorMaximo;
						valorMaximo = numeros[i];
					} else if(numeros[i] < valorMinimo){
						numerosOrdenados[1] = valorMinimo;
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
	
	
	
	
	
