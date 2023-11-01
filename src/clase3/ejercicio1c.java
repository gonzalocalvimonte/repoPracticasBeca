package clase3;

public class ejercicio1c {

	public static void main(String[] args) {
		
		int numeros[] = new int[] {20,12,10,11,18,52,63,4,89,3,7};
		
		int x = 60;
		
		int sumatoria = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > x) {
				sumatoria = sumatoria + numeros[i];
			}
		}
		
		System.out.println(sumatoria);
	}
	
	
}
