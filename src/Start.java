import java.util.ArrayList;
import java.util.Scanner;

/*Crear una o varias estructuras para almacenar el nombre de los empleados y el salario mensual
de cada uno de ellos (Arrays)
En primer lugar, el programa le pedirá al usuario el número de empleados que desea crear.
A continuación, se le pedirá su nombre y después el salario de cada uno de los empleados y los
almacenará en las estructuras creadas (Arrays)
Seguidamente mostrará un listado de todos los empleados y el salario de cada uno de ellos.
Y al final mostrará la media de todos los sueldos introducidos. 
*/
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scrIn = new Scanner(System.in);

		int i = 0, numEmpleados = 0;
		float mediaSalarios = 0.0f;

		System.out.println("Introduzca el número de empleados: ");
		numEmpleados = scrIn.nextInt();

		String[] nombres = new String[numEmpleados];
		float[] salarios = new float[numEmpleados];

		for (i = 0; i < nombres.length; i++) {// Recoger los datos de nombre y salario

			System.out.println("Introduzca el nombre del empleado: " + (i + 1) + " : ");
			nombres[i] = scrIn.next();
			System.out.println("Introduzca el salario del empleado: " + (i + 1) + " : ");
			salarios[i] = scrIn.nextFloat();
		}
		for (i = 0; i < nombres.length; i++) {// Imprimo los datos
			System.out.println("nombre: " + nombres[i] + " Salario: " + salarios[i]);

			mediaSalarios = mediaSalarios + salarios[i];// saco media

		}
		mediaSalarios = mediaSalarios / nombres.length;
		System.out.println("");
		System.out.println("La media salarial es: " + mediaSalarios);
		
		System.out.println("");
		System.out.println("****************************VERSION 2*****************************");
		System.out.println("");

		int j = 0, numeroEmpleados = 0;
		float mediaD = 0.0f;

		System.out.println("Introduzca el numero de emmpleados: ");
		numeroEmpleados = scrIn.nextInt();

		// El arrayList manda a llamar una clase'Float', no trabaja con elementos
		// basicos.
		ArrayList<String> nombreEmpleados = new ArrayList<String>();
		ArrayList<Float> salariosEmpleado = new ArrayList<Float>();

		for (j = 0; j < numeroEmpleados; j++) {// Para añadir datos es con el metodo arrayList.add()
			System.out.println("Introduzca el nombre del empleado " + (j + 1) + ": ");
			nombreEmpleados.add(scrIn.next());
			System.out.println("Introduzca el salario del empleado " + (j + 1) + ": ");
			salariosEmpleado.add(scrIn.nextFloat());
		}
		for (j = 0; j < salariosEmpleado.size(); j++) {
			System.out.println(nombreEmpleados.get(j) + " gana: " + salariosEmpleado.get(j));// mostrar datos
			mediaD = mediaD + salariosEmpleado.get(j);
		}
		System.out.println("");
		mediaD = mediaD / salariosEmpleado.size();
		System.out.println("la media del array dinamimco es: " + mediaD);

	}
	
	//********************************************************FUNCTIONS ARRAYS 1, 2 Y 3 DIMENCIONES*********************************
	
	public void arraysUnoDosTresDimensiopnes() {

		Scanner scrIn = new Scanner(System.in);
		int i, j, k;
			
		//Version1***************************************************************************************************
		System.out.println("Array unidiminsional");
		String []  nombres= {"pepito", "juanito", "torito", "carlitos"};
		for(i=0; i<nombres.length; i++) {
			System.out.println("Los nombres del array unidimesional son: "+nombres[i]);
		}
		System.out.println("");
		
		System.out.println("Array bidimensional");
		String [] [] ingredientes= {{"jamon", "champiñon", "queso", "tomate", "piña", "york", "bacon", "salami"}};
		for(i=0; i<ingredientes.length; i++) {
			for(j=0; j<ingredientes[i].length; j++) {
				System.out.println("Los nombres del array bidemencional son: "+ingredientes[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Array tridimencionales");
		int [] [] [] notas= {{{2,4,6,8,5,6,9,7,8,9,10,10,2,4,5,7}}};
		for(i=0; i<notas.length; i++) {
			for(j=0; j<notas[i].length; j++) {
				for(k=0; k<notas[i][j].length; k++) {
					System.out.println("Los nombres del array tridimensional son: "+notas[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("");

		}
		
		//version2******************************************************************************************
		System.out.println("Array unidiminsional");
		String [] apellidos = new String[4];
		for(i=0; i<apellidos.length; i++) {
			System.out.println("Introduzca el apellido de: " + (i + 1) + " : ");
			apellidos[i] = scrIn.next();
		}
		for(i=0; i<apellidos.length; i++) {
			System.out.println("Los apellidos del array unidimesional son: "+apellidos[i]);
		}
		System.out.println("");
		
		
		
		System.out.println("Array bidimensional");
		String [][] colores = new String[4][2];
		for(i=0; i<colores.length; i++) {
			for(j=0; j<colores[i].length; j++) {
				System.out.println("Introduzca el color "+ (i+1) + " , " + (j+1)+ " : ");
				colores[i][j] = scrIn.next();
				System.out.println("");
			}
		}
		for(i=0; i<colores.length; i++) {
			for(j=0; j<colores[i].length; j++) {
				System.out.println("Los colores del array bidemencional son: "+colores[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		System.out.println("Array tridimencional");
		int [][][] usuarios = new int[3][2][4];
		for(i=0; i<usuarios.length; i++) {
			for(j=0; j<usuarios[i].length; j++) {
				for(k=0; k<usuarios[i][j].length; k++) {
					System.out.println("Introduzca el usario "+ (i+1) + " , " + (j+1)+ " , "+ (k+1)+" : ");
					usuarios[i][j][k] = scrIn.nextInt();
				}
				System.out.println("");
			}
		}
		for(i=0; i<usuarios.length; i++) {
			for(j=0; j<usuarios[i].length; j++) {
				for(k=0; k<usuarios[i][j].length; k++) {
					System.out.println("Los usuarios del array tridimensional son: "+usuarios[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

}
