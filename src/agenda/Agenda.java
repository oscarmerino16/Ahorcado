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
		String eliminar="";
		System.out.println("�Que usuario quieres eliminar?");
        eliminar= leer.next();
		for (int i = 0; i < mContactos.length; i++) {
 
            if ((mContactos[i][0].equalsIgnoreCase(eliminar)) || (mContactos[i][1].equalsIgnoreCase(eliminar))) {
				mContactos[i][0]="";
				mContactos[i][1]="";
            }
        }
		
	}
	
	public static void verContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		
		for (int i = 0; i < mContactos.length; i++) {
            System.out.println("El nombre del contacto es " + mContactos[i][0] + " y su telefono es " + mContactos[i][1]);
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
	
	public static void editarContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		
		String editar="", editnom="", edittel="";
		System.out.println("�Que usuario quieres editar?");
        editar= leer.next();
        
        for (int i = 0; i < mContactos.length; i++) {
        		
			if (mContactos[i][0].equalsIgnoreCase(editar) || mContactos[i][1].equalsIgnoreCase(editar)) {
				System.out.println("Que nombre quieres ponerle");
				editnom= leer.next();
				mContactos[i][0]= editnom;
				System.out.println("Que telefono quieres ponerle");
				edittel= leer.next();
				mContactos[i][1]= edittel;
				
			}
		}
		
	}
	
	public static void buscarContacto(String mContactos[][]) {
		
		Scanner leer = new Scanner(System.in);
		
		String buscar="";
		System.out.println("�Que usuario quieres buscar?");
        buscar= leer.next();
        
        for (int i = 0; i < mContactos.length; i++) {
        		
			if (mContactos[i][0].equalsIgnoreCase(buscar) || mContactos[i][1].equalsIgnoreCase(buscar)) {
				System.out.println("El nombre del contacto es " + mContactos[i][0] + " y su telefono es " + mContactos[i][1]);
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		int num = 0, columna=2, fila=0;
	
		System.out.println("Dime el numero de filas que quieres");
		fila= leer.nextInt();
		
		String mContactos [][] = new String [fila][columna];
		
		llenarMatriz(mContactos);
		
		while (num!=6) {
			System.out.println("1- Guardar contactos");
			System.out.println("2- Ver contactos");
			System.out.println("3- Eliminar contactos");
			System.out.println("4- Editar contactos");
			System.out.println("5- Buscar contacto");
			System.out.println("6- Salir");
			
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
				editarContacto(mContactos);
				break;
			case 5:
				buscarContacto(mContactos);
				break;
			
			}
		}	
	}
	
	}


