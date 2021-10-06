package com.docker.service;

import java.util.List;

import com.docker.entity.Course;

public interface CourseService {
	public List<Course> getCourses();

	public Course getCourse(String courseID);
	
	public Course addCourse(Course course);
	
	public void deleteCourse(String courseID);
	
	public Course updateCourse(Course course, String courseID);


}
