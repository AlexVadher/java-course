package co.edu.ue.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping(value="courses", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> postCourses(@RequestBody Course course){
		return course.postCourse(course); 
	}
}
