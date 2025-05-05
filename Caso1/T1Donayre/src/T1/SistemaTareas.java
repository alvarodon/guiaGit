package T1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SistemaTareas {

	public static void main(String[] args) {
		
		
		//Scanner
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Cuantas tareas desea registrar");
		int cant_tareas=sc.nextInt();
		
		
		
		//Se define el vector Tarea
		Tarea[] tareas=new Tarea[cant_tareas];
		
		
		//Los datos se ingresar en un bucle for
		for(int i=0;i<cant_tareas;i++){
			int fechaentrega=0;
			int nivelprio=0;
			
			System.out.println("Tarea "+(i+1));
			System.out.println("Nombre: ");
			String nombre=sc.next();
			
			System.out.println("Descripcion: ");
			String descripcion=sc.next();
			
			boolean validarfecha=false;
			
			//Uso de try-catch para validar que los datos ingresados sean enteros sino, saldra un mensaje y nos pedira volver a ingresar el dato 
			while(!validarfecha) {
				try {
					System.out.println("Dia de entrega del mes de mayo: ");
					fechaentrega=sc.nextInt();
					validarfecha=true;
					
				}
				catch(Exception t) {
					System.out.println("Ingrese un numero entero valido para la fecha de entrega: ");
					sc.next();
					
				}				
			}
			
			boolean validarnivelprio=false;
			
			while(!validarnivelprio) {
				try {
					System.out.println("Nivel de prio: ");
					nivelprio=sc.nextInt();
					validarnivelprio=true;
					
				}
				catch(Exception t) {
					System.out.println("Ingrese un numero entero valido para el nivel de prioridad: ");
					sc.next();
					
				}				
			}
			
			System.out.println("Estado: ");
			String estado=sc.next();
			
			
			
			tareas[i]=new Tarea(nombre,descripcion,fechaentrega,nivelprio,estado);
			

				}

		//Uso de comparador para ordenar las tareas segun su nivel de prioridad.		
		 Arrays.sort(tareas,new Comparator <Tarea>(){

			   public int compare(Tarea a, Tarea b){

			        return Double.compare(b.getNivelprio(), a.getNivelprio());

			        }

			        });

			        

			    System.out.println("");

			    System.out.println("Listado por prioridad");

			    int pos=1;

			    for(Tarea t: tareas) {

			    System.out.print("#"+(pos++)+" ");

			    t.mostrar();
			    }
			    
			    
		//Se pide ingresar un nombre para poder buscar una tarea	    
	     System.out.println("");
		 System.out.println("Ingrese el nombre de la tarea a buscar: ");
		 String buscar=sc.next();

				
		 for(Tarea t:tareas) {
			 if(buscar.equals(t.getNombre())) {
				System.out.println("Se encontro la tarea, se mostraran sus datos: ");
				t.mostrar();
			}
		 }
		 
		 //Uso del metodo dias restantes utilizado junto con un mensaje
	     System.out.println("");
		 System.out.println("Dias restantes para cada tarea (actualmente 4 de mayo): ");
		 
		 int posicion=1;
		
		 for(Tarea t:tareas) {
			 System.out.println("Tarea "+(posicion++)+":  "+t.diasRestantes()+" dias");
			 
		 }

		 
		 
		 
		 
		 
			

	}

}

