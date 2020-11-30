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
		int pos;
		System.out.println("�Que usuario quieres eliminar?");
        eliminar= leer.next();
        pos=buscar(mContactos,eliminar);
        
        if (pos == -1) {
            System.out.println("El contacto no esta");
        }else {
        	 if ((mContactos[pos][0].equalsIgnoreCase(eliminar)) || (mContactos[pos][1].equalsIgnoreCase(eliminar))) {
 				mContactos[pos][0]="";
 				mContactos[pos][1]="";
             }
        }
        
          
		}
	
	public static void verContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		
		for (int i = 0; i < mContactos.length; i++) {
			if (!mContactos[i][0].equalsIgnoreCase("")) {
				 System.out.println("El nombre del contacto es " + mContactos[i][0] + " y su telefono es " + mContactos[i][1]);
			}
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
		int pos;
		System.out.println("�Que usuario quieres editar?");
        editar= leer.next();
        
        pos=buscar(mContactos, editar);
        
        if (pos == -1) {
            System.out.println("El contacto no esta");
        } else {
            System.out.println("Que quieres editar su nombre o telefono");
            editar = leer.next();
            if (editar.equalsIgnoreCase("Telefono")) {
                System.out.println("Que numero de telefono quieres ponerle");
                edittel = leer.next();
                mContactos[pos][1] = edittel;
            }
            if (editar.equalsIgnoreCase("nombre")) {
                System.out.println("Que nombre quieres ponerle");
                editnom = leer.next();
                mContactos[pos][0] = editnom;

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
	
	public static int buscar(String mContactos[][], String busqueda) {
		//buscar posicion
        for (int i = 0; i < mContactos.length; i++) {
            if (mContactos[i][0].equalsIgnoreCase(busqueda) || mContactos[i][1].equalsIgnoreCase(busqueda)) {
                return i;
            }
        }

        return -1;
    }
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		int num = 0, columna=2, fila=0, busqueda=0;
	
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


