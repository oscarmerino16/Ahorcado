package primera_parte;

import java.util.Random;
import java.util.Scanner;

public class Metodos {

	public static void dibujarMuneco(int vidas) {

		//Segun numero de vidas dibujar muñeco
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
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 4:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|                 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 3:
			
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|                 |");
			System.out.println("|          |--------------|");
			System.out.println("|          |   0     0    |");
			System.out.println("|          |      N       |");
			System.out.println("|          |   ________   |");
			System.out.println("|          |              |");
			System.out.println("|          |--------------|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 2:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|                 |");
			System.out.println("|          |--------------|");
			System.out.println("|          |   0     0    |");
			System.out.println("|          |      N       |");
			System.out.println("|          |   ________   |");
			System.out.println("|          |              |");
			System.out.println("|          |--------------|");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			
			break;
		case 1:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|                 |");
			System.out.println("|          |--------------|");
			System.out.println("|          |   X     0    |");
			System.out.println("|          |      N       |");
			System.out.println("|          |   ________   |");
			System.out.println("|          |              |");
			System.out.println("|          |--------------|");
			System.out.println("|                  |");
			System.out.println("|               \\  |  /");
			System.out.println("|                \\ | /");
			System.out.println("|                 \\|/");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________________");
			break;
		case 0:
			System.out.println("__________________");
			System.out.println("|                 |");
			System.out.println("|                 |");
			System.out.println("|          |--------------|");
			System.out.println("|          |   X     x    |");
			System.out.println("|          |      N       |");
			System.out.println("|          |   ________   |");
			System.out.println("|          |              |");
			System.out.println("|          |--------------|");
			System.out.println("|                  |");
			System.out.println("|               \\  |  /");
			System.out.println("|                \\ | /");
			System.out.println("|                 \\|/");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                  |");
			System.out.println("|                 / \\");
			System.out.println("|                /   \\");
			System.out.println("|               /     \\");
			System.out.println("|________________");
			break;
				
		}
		
		
	}
	
	public static  void inicializarVectores(String palabra,String vPalabra[], String vAciertos[], String vFallos[]) {
		// Inizializar los vectores
		for (int i = 0; i < vFallos.length; i++) {
			
			vFallos[i]= "_";
		}
		for (int i = 0; i < vPalabra.length; i++) {
			
			vPalabra[i]= palabra.substring(i,i+1);
			vAciertos[i]= "_";
		}
	
	}
	
	public static void dibujarAciertorErrores(String vFallos[], String vAciertos[]) {
		
		//Imprimir los fallos
		System.out.println("Fallos cometidos:");
		for (int i = 0; i < vFallos.length; i++) {
			if (!vFallos[i].equals("_")) {
				System.out.print(vFallos[i] + " ");
			}
		}
		
		
		System.out.println("\n¡Palabra Secreta!");
		//Imprimir los aciertos
		for (int i = 0; i < vAciertos.length; i++) {
			System.out.print(vAciertos[i]+ " ");
		}
	}
	
	public static int comprobarLetraIntroducida(int vidas, String letra, String vPalabra[], String vAciertos[],
					String vFallos[]) {
				boolean encontrado=false;
				for (int i = 0; i < vPalabra.length; i++) {
					if (letra.equalsIgnoreCase(vPalabra[i])) {
						vAciertos[i]=letra;
						encontrado=true;
						
					}
					
				}

				if (encontrado == false) {
					for (int i = 0; i < vFallos.length; i++) {
						if (vFallos[i].equals("_")) {
							vFallos[i]=letra;
							vidas --;
							break;
						}
					}
				}
				
				
				return vidas;
			}
	
	public static boolean heGanado(String vAciertos[]) {
		//Comprobar si hemos gandado
		for (int i = 0; i < vAciertos.length; i++) {
			if (vAciertos[i].equals("_")) {

				return false;
			}
		}
		
		System.out.println("\n Muy bien has acertado la palabra");
		return true;
	} 
	
	public static String generarPalabra() {
		//generar palabra aleatoria
		String palabra;
		int num;
		
		String vPalabra[]={"hola", "adios", "baloncesto", "teclado", "blanco", "ciudad", "tres", "futbol", "pepe", "joseluis"};
		
		 Random r = new Random();
	     num = r.nextInt(vPalabra.length);
	     palabra = vPalabra[num];
	
		 return palabra;
	}
	
	

}
	

