package primera_parte;

import java.util.Random;
import java.util.Scanner;

public class Parte_1 {
	
	public static void main(String[] args) {
		// vidas totales 7
		
		int vidas=7;
		String palabra=Metodos.generarPalabra();
		String letra="";
		String vPalabra[], vAciertos[], vFallos[];
		vPalabra= new String[palabra.length()];
		vAciertos= new String[palabra.length()];
		vFallos= new String[vidas+1];
		Metodos.inicializarVectores(palabra, vPalabra, vAciertos, vFallos);
		
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Dime una letra a ver si esta en la palabra");
			letra= leer.next();
		
			//comprobarLetraIntroducida(letra,vPalabra, vAciertos, vFallos);
			vidas = Metodos.comprobarLetraIntroducida(vidas, letra,vPalabra, vAciertos, vFallos);
			
			Metodos.dibujarMuneco(vidas);
			
			Metodos.dibujarAciertorErrores(vFallos, vAciertos);
			
			
		} while (vidas>0 && Metodos.heGanado(vAciertos)==false);

	}
}
