import java.util.Scanner;

public class HERRAMIENTAS_STRINGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce cadena 1: ");
		String cadena1 = in.nextLine();
		
		System.out.println("Introduce cadena 2: ");
		String cadena2 = in.nextLine();
		
		// Compruebo si son iguales con el metodo equals!!!!
		if( cadena1.equals(cadena2) == true){
			System.out.println("Cadenas iguales");
		}else{
			// Compruebo si son iguales independientemente de si tiene mayúsculas o minúsculas
			if( cadena1.equalsIgnoreCase(cadena2) == true){
				System.out.println("Cadenas iguales aunque idependientemente de si son mayúsculas o minusculas");
			}else{
				System.out.println("Las cadenas no son iguales");
			}
		}
		
			
		// Convertir mayúsculas en minúsculas
		cadena1 = cadena1.toLowerCase();
		cadena2 = cadena2.toLowerCase();
		
		if( cadena1.equals(cadena2) == true){
			System.out.println("Cadenas iguales tras ponerlas en minúsculas");
			System.out.println(cadena1 + " " + cadena2);
		}else{
			System.out.println("Las cadenas no son iguales");
		}
		
		// Obtener una letra dependiendo de su posición
		char letra = cadena1.charAt(2);
		System.out.println("La tercera letra de " + cadena1 + " es :" + letra);
		
		// Longitud de la cadena
		System.out.println("La cadena " + cadena1 + " tiene una longitud de " + cadena1.length() + " letras");
		
		
		// indexOf me da la primera posición de un caracter... -1 si no está
		System.out.println(cadena1.indexOf('z'));
		
		
		// Substring coge parte de una cadena, desde una posición de inicio hasta otra del final. 
		
		System.out.println("Las tres primeras letras de cadena1 son " + cadena1.substring(0,3));
		
		
		// Como "recorrer" una cadena caracter a caracter
		for(int i=0; i< cadena1.length(); i++){
			
			System.out.println(cadena1.charAt(i));
		}
		
		

	}

}
