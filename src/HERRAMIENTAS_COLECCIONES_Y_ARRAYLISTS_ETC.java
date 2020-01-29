import java.util.ArrayList;

public class HERRAMIENTAS_COLECCIONES_Y_ARRAYLISTS_ETC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ej1 = new ArrayList<Integer>();

			//Añadir un elemento numerico ya que se trata de un Integer = int
			ej1.add(1);
			//Obtener la caantidad de elementos que esta coleccion almacena
			ej1.size();
		
		ArrayList<String> ej2 = new ArrayList<String>();
		
			//Añadir una palabra puesto que se trata de un String
			ej2.add("ejemplo");
			//Obtener la caantidad de elementos que esta coleccion almacena
			ej2.size();
			
			//Conseguir ultimo elemento
			String ultimoelemento = null;
			
			//Obtener el elemento de la posicion i
			ej2.get(2);
			//Pone el elemento T en la posicion i
			ej2.set(2, "hola");
			

	}

}
