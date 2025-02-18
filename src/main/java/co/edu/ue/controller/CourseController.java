package co.edu.ue.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Course;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value="apiweb")
public class CourseController {
	//Atributos
	Course course;
	
	@PostConstruct
	public void init() {
		course = new Course();
	}
	
	@GetMapping(value="courses", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> getCourses(){
		return course.myListCourses();
	}
	// Método para agregar un curso nuevoo a la lista de cursos y retornar la lista de cursos
	@PostMapping(value="courses", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> postCourses(@RequestBody Course newCourse){
		return course.postCourse(newCourse);
	}
	// Método para Actualizar un curso de la lista de cursos y retornar la lista de cursos
	@PostMapping(value="updateCourses", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> updateCourses(@RequestBody Course newCourse) {
		return course.updateCourse(newCourse);
	}
	// Método para eliminar un curso de la lista de cursos y retornar la lista de cursos
	@DeleteMapping(value="deleteCourses/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> deleteCourses(@PathVariable String name) {
	    return course.deleteCourse(name);
	}
}
