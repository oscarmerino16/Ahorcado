package agenda;

import java.util.Scanner;


public class Agenda {
	
	public static void llenarMatriz(String mContactos[][]) {
        for (int i = 0; i < mContactos.length; i++) {
            for (int j = 0; j < mContactos[i].length; j++) {
                mContactos[i][j]= "";
            }
        }
	}
	
	public static void eliminarContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
	
		for (int i = 0; i < mContactos.length; i++) {
            System.out.println("¿Que usuario quieres eliminar?");
            mContactos[i][0]= leer.next();
            if (mContactos[i][0].equalsIgnoreCase(mContactos[i][0])) {
				mContactos[i][0]="";
				mContactos[i][1]="";
            }
            
			if (!mContactos[i][0].equalsIgnoreCase(mContactos[i][0])) {
				System.out.println("Ese usuario no existe");
				
			}
			break;
        }
		
		
		
	}
	public static void verContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		
		for (int i = 0; i < mContactos.length; i++) {
            System.out.println(mContactos[i][0] + " " + mContactos[i][1]);
        }
		}
	
	public static void nuevoContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < mContactos.length; i++) {
			if (mContactos[i][0].equalsIgnoreCase( "")) {
				System.out.println("Dime el nombre del nuevo empleado");
				mContactos[i][0]= leer.next();	
				System.out.println("Dime el telf del nuevo empleado");
				mContactos[i][1]= leer.next();	
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		int num = 0, columna=2, fila=0;
		
		String nombre="", eliminar="", buscar="", ver="",cont="",telf="";
	
		System.out.println("Dime el numero de filas que quieres");
		fila= leer.nextInt();
		
		String mContactos [][] = new String [fila][columna];
		
		llenarMatriz(mContactos);
		
		while (num!=5) {
			System.out.println("1- Guardar contactos");
			System.out.println("2- Ver contactos");
			System.out.println("3- Eliminar contactos");
			System.out.println("4- Editar contactos");
			System.out.println("5- Salir");
			
			num= leer.nextInt();
			
			switch (num) {
			case 1:
					nuevoContacto(mContactos);
				break;
			case 2:
				verContacto(mContactos);
				break;
			case 3:
				eliminarContacto(mContactos);
				break;
			case 4:
		
				break;
			
			}
		}	
	}
	
	}


