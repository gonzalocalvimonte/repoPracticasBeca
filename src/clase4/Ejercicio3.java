package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Encriptador("decodificar",1,"C:\\Users\\GonzaloCalvimonte\\eclipse-workspace\\programitaDePrueba\\mensajeEntrada","C:\\Users\\GonzaloCalvimonte\\eclipse-workspace\\programitaDePrueba\\mensajeSalida");
	}
	
	public static void Encriptador(String metodoCodDec, int ordenMov, String urlArchivoEntrada, String urlArchivoSalida) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String metodo = metodoCodDec;
		int orden = ordenMov;
		String urlIngreso = urlArchivoEntrada;
		String urlSalida = urlArchivoSalida;
		String mensajeCodificado = "";
		String mensajeDecodificado = "";
		
		try {
			
				if(metodo.equals("codificar")) {
					
					for (String linea : Files.readAllLines(Paths.get(urlIngreso))){
					for (int i = 0; i < linea.length(); i++) {
						for (int j = 0; j < abecedario.length(); j++) {	
							
							if (linea.charAt(i) == abecedario.charAt(j) && orden == 1 && linea.charAt(i) == 'z') {
								mensajeCodificado = mensajeCodificado + " ";
							}else if (linea.charAt(i) == abecedario.charAt(j) && orden == 2 && linea.charAt(i) == 'y') {
								mensajeCodificado = mensajeCodificado + " ";
							}else if (linea.charAt(i) == abecedario.charAt(j) && orden == 2 && linea.charAt(i) == 'z') {
								mensajeCodificado = mensajeCodificado + abecedario.charAt(0);
							}
							else if(linea.charAt(i) == abecedario.charAt(j)){
								mensajeCodificado = mensajeCodificado + abecedario.charAt(j+orden);
							}
							
						}
					}
					Files.writeString(Paths.get(urlSalida),mensajeCodificado);
					System.out.println("Salio todo bien. Mensaje codificado");
				}
					}else if(metodo.equals("decodificar")) {
					
						for (String linea : Files.readAllLines(Paths.get(urlIngreso))){
					for (int i = 0; i < linea.length(); i++) {
					for (int j = 0; j < abecedario.length(); j++) {	
						
						if (linea.charAt(i) == abecedario.charAt(j) && orden == 1 && linea.charAt(i) == 'a') {
							mensajeDecodificado = mensajeDecodificado + " ";
						}else if (linea.charAt(i) == abecedario.charAt(j) && orden == 2 && linea.charAt(i) == 'b') {
							mensajeDecodificado = mensajeDecodificado + " ";
						}else if (linea.charAt(i) == abecedario.charAt(j) && orden == 2 && linea.charAt(i) == 'a') {
							mensajeDecodificado = mensajeDecodificado + abecedario.charAt(abecedario.length() - 1);
						}
						else if(linea.charAt(i) == abecedario.charAt(j)){
							mensajeDecodificado = mensajeDecodificado + abecedario.charAt(j-orden);
						}
						
					}
				}
				
					Files.writeString(Paths.get(urlSalida),mensajeDecodificado);
					System.out.println("Salio todo bien. Mensaje decodificado");
				}
					
			}
					
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
