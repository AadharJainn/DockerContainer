package com.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.Course;
import com.docker.service.CourseService;



@RestController
public class controller {
	@Autowired
	private CourseService cs;

	@RequestMapping("/home")
	public String home() {
		return "this is home page";
	}

	// method to get all courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return cs.getCourses();
	}

	@GetMapping("/courses/{courseID}")
	public Course getCourse(@PathVariable String courseID) {
		return this.cs.getCourse(courseID);

	}

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.cs.addCourse(course);}

	@PutMapping("/courses/{courseID}")
	public Course updateCourse(@RequestBody Course course, @PathVariable String courseID) {
		return this.cs.updateCourse(course, courseID);

	}

	@DeleteMapping("/courses/{courseID}")
	public void deleteCourse(String courseID) {
		return ;
	}
}
