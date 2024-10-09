package co.edu.ue.model;

import java.util.ArrayList;

public class Course {
	//1.Atributos->nombres de atributos significativos
	private String name;
	private String descripcion;
	private double duration;
	private double cost;
	ArrayList<Course> ListCourses = new ArrayList<>();
	
	//2.Constructores->permiten la inicializacion de atributos
	//el constructor esta casado con la instanciación
	//Puedo tener más de un constructor->sobrecarga de constructores
	//el constructor siempre es público
	
	public Course() {}
	public Course(String name, String descripcion, double duration, double cost) {
		super();
		this.name = name;
		this.descripcion = descripcion;
		this.duration = duration;
		this.cost = cost;
	}
	public Course(String name) {
		super();
		this.name = name;
	}
	//3. metodos de acceso
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public ArrayList<Course> myListCourses(){
		
		/*para instaciar objetos
		 * NombreClase nombreObjeto = new NombreClase()
		 * */
		this.ListCourses.add(new Course("JAVA", "CURSO BÁSICO JAVA", 40.5, 20));
		this.ListCourses.add(new Course("PYTHON", "CURSO BÁSICO PYTHON", 30.5, 25));
		this.ListCourses.add(new Course("C++", "CURSO BÁSICO C++", 23.5, 21.5));
		return this.ListCourses;
	}
	
	public ArrayList<Course> postCourse(Course myCourse){
		//validar que el objeto myCourse tenga datos, cada uno de los elementos
		ArrayList<Course> courses = new ArrayList<>();
		courses = this.ListCourses;
		courses.add(myCourse);
		this.ListCourses = courses;
		return this.ListCourses;
	}
	
	public ArrayList<Course> searchCourses(String name){
		ArrayList<Course> auxList = new ArrayList<>();
		ArrayList<Course> coursesReturn = new ArrayList<>();
		auxList = this.ListCourses;
		for(Course c: auxList) {
			if(c.getName().contains(name)){
				coursesReturn .add(c);
			}
			
		}
		
		return coursesReturn;
	}
	public ArrayList<Course> deleteCourse(String name){
		ArrayList<Course> coursesReturn = new ArrayList<>();
		coursesReturn = this.ListCourses;
		coursesReturn.removeIf(c->c.getName().equals(name));
		this.ListCourses = coursesReturn;
		return this.ListCourses;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", descripcion=" + descripcion + ", duration=" + duration + ", cost=" + cost
				+ "]";
	}
	
	
	

}
