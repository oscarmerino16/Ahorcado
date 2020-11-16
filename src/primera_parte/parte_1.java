package primera_parte;

import java.util.Scanner;

public class parte_1 {

	public static void dibujarMuneco(int vidas) {

		
		switch (vidas) {
		case 6:
			System.out.println("________________");
			break;
		case 5:
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 4:
			System.out.println("__________");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 3:
			
			System.out.println("__________");
			System.out.println("|        |");
			System.out.println("|        0");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 2:
			System.out.println("__________");
			System.out.println("|        |");
			System.out.println("|        0");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			
			break;
		case 1:
			System.out.println("__________");
			System.out.println("|        |");
			System.out.println("|        0");
			System.out.println("|      /\\| /");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 0:
			System.out.println("__________");
			System.out.println("|        |");
			System.out.println("|        0");
			System.out.println("|     /\\ | /");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|       / \\ ");
			System.out.println("|");
			System.out.println("|________________");
			break;
				
		}
		
		
	}
	
	
	public static boolean comprobarLetra(String vPalabra[], String letra, String vAciertos[]) {
		boolean encontrado=false;
		

		
		return encontrado;
	}
	
	public static  void inicializarVectores(String palabra,String vPalabra[], String vAciertos[], String vFallos[]) {
		
		for (int i = 0; i < vFallos.length; i++) {
			
			vFallos[i]= "_ ";
		}
		for (int i = 0; i < vPalabra.length; i++) {
			
			vAciertos[i]= "_ ";
			vPalabra[i]= "palabra.substring(i,i+1)";
		}
	
	}
	
	public static void main(String[] args) {
		// vidas totales 7
		
		int vidas=7;
		String palabra="Futbol";
		String letra="";
		String vPalabra[], vAciertos[], vFallos[];
		vPalabra= new String[palabra.length()];
		vAciertos= new String[palabra.length()];
		vFallos= new String[vidas];
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Dime una letra haber si esta en la palabra");
			letra= leer.next();
			
		
			
				
			
			
			
			
			dibujarMuneco(vidas);
			
			
			//vidas--;
		} while (vidas>=0);

	}

}
