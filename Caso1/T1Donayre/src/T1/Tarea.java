package T1;

public class Tarea {
	
	//Definicion de variables
	private String nombre;
	private String descripcion;
	private int fechaentrega;
	private int nivelprio;
	private String estado;
	
	
	
	//Constructores
	
	public Tarea() {
		
	}
	
	public Tarea(String nombre, String descripcion, int fechaentrega, int nivelprio, String estado) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaentrega = fechaentrega;
		this.nivelprio = nivelprio;
		this.estado = estado;
	}
	
	
	
    //Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getFechaentrega() {
		return fechaentrega;
	}

	public void setFechaentrega(int fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public int getNivelprio() {
		return nivelprio;
	}

	public void setNivelprio(int nivelprio) {
		this.nivelprio = nivelprio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	//Metodo mostrar que sirve para mostrar todos los datos de una Tarea
	public void mostrar() {
		System.out.println("Nombre "+nombre+", Descripcion: "+descripcion+", Dia de entrega del mes de mayo: "+fechaentrega+", Nivel de prioridad: "+nivelprio+", Estado:"+estado);
	}
	
	
	//Metodo diasRestantes que sirve para arrojar los dias que quedan para la fecha de entrega
	public int diasRestantes() {
		int dias=0;
        dias=fechaentrega-4;
			
		
		return dias; 
	}
		
	

}
