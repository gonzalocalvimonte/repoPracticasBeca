package clase3;


public class ejercicio1a{

	public static void main(String[] args) {
		
 String txt1 = "Hola mundo como va";
 
		int contador = 0;
		
		char letra = 'a';
		
		for (int i = 0 ; i < txt1.length() ; i++ ) {
			if(txt1.charAt(i) == letra) {
				contador = contador + 1;
			}
			
		}
		System.out.println(contador);


		
		
	}
}