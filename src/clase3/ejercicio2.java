package clase3;

public class ejercicio2 {
	
	public static void main(String[] args) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String mensaje = "aaaabaaaa";
		String metodo = "decodificar";
		int orden = 2;
		String mensajeCodificado = "";
		String mensajeDecodificado = "";
		
		if(metodo.equals("codificar")) {
			for (int i = 0; i < mensaje.length(); i++) {
				for (int j = 0; j < abecedario.length(); j++) {	
					
					if (mensaje.charAt(i) == abecedario.charAt(j) && orden == 1 && mensaje.charAt(i) == 'z') {
						mensajeCodificado = mensajeCodificado + " ";
					}else if (mensaje.charAt(i) == abecedario.charAt(j) && orden == 2 && mensaje.charAt(i) == 'y') {
						mensajeCodificado = mensajeCodificado + " ";
					}else if (mensaje.charAt(i) == abecedario.charAt(j) && orden == 2 && mensaje.charAt(i) == 'z') {
						mensajeCodificado = mensajeCodificado + abecedario.charAt(0);
					}
					else if(mensaje.charAt(i) == abecedario.charAt(j)){
						mensajeCodificado = mensajeCodificado + abecedario.charAt(j+orden);
					}
					
				}
			}
			System.out.println(mensajeCodificado);
		}else if(metodo.equals("decodificar")) {
			for (int i = 0; i < mensaje.length(); i++) {
			for (int j = 0; j < abecedario.length(); j++) {	
				
				if (mensaje.charAt(i) == abecedario.charAt(j) && orden == 1 && mensaje.charAt(i) == 'a') {
					mensajeDecodificado = mensajeDecodificado + " ";
				}else if (mensaje.charAt(i) == abecedario.charAt(j) && orden == 2 && mensaje.charAt(i) == 'b') {
					mensajeDecodificado = mensajeDecodificado + " ";
				}else if (mensaje.charAt(i) == abecedario.charAt(j) && orden == 2 && mensaje.charAt(i) == 'a') {
					mensajeDecodificado = mensajeDecodificado + abecedario.charAt(abecedario.length() - 1);
				}
				else if(mensaje.charAt(i) == abecedario.charAt(j)){
					mensajeDecodificado = mensajeDecodificado + abecedario.charAt(j-orden);
				}
				
			}
		}
		System.out.println(mensajeDecodificado);
		}
		
		
	}
	
	
}
