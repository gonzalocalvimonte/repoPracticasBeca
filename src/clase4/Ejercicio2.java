package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Ejercicio2 {

	
	public static void main(String[] args) {
		sumatoria();
}
	
	public static void sumatoria() {
		int suma = 0;
		int multiplicacion = 1;
		String operacion = "multiplicacion";
		String archivo = "C:\\Users\\GonzaloCalvimonte\\eclipse-workspace\\programitaDePrueba\\archivoDeTextoEjercicio2";
		try {
		
			for (String linea : Files.readAllLines(Paths.get(archivo))){
				if(operacion == "suma") {
				
					for (int i = 0; i < linea.length(); i++) {
					int caracterNumero = Character.getNumericValue(linea.charAt(i));
					suma = suma + caracterNumero;
					}
					System.out.println(suma);
					
				}else if(operacion == "multiplicacion") {
					
					for (int i = 0; i < linea.length(); i++) {
						int caracterNumero = Character.getNumericValue(linea.charAt(i));
						multiplicacion = multiplicacion * caracterNumero;
						}
						System.out.println(multiplicacion);
				
				}
			
		}
			} catch (IOException e) {		
			e.printStackTrace();
		}
	
	
		
	
	
	
	}
}
	

