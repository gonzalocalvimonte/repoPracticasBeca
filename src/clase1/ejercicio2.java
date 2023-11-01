package clase1;

public class ejercicio2 {
	public static void main(String[] args) {
		
		
/*
  A y B:*Ingresos mensuales, 
 		* Cant Vehiculos (a su vez, la variablea de la antiguedad de los mismos tambien esta ligada , 
 		* Cant Inmuebles, 
 		* Si posee o no embarcacion de lujo
*/
		//Variables
		float ingresosMensuales = 100000;
		int cantVehiculos= 0;
		int antiguedadVehic= 5;
		int inmuebles= 1;
		boolean embarcacionLujo= false;
		
		//Condicion
		if(ingresosMensuales >= 489083 || (cantVehiculos>= 3 && antiguedadVehic >=5) || inmuebles >= 3 || embarcacionLujo == true) {
			System.out.print("Pertenece a Ingresos Altos");
		} else {
			System.out.print("No pertenece a Ingresos Altos");
		}
	}
}
