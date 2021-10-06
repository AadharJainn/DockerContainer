package com.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.dao.CourseDAO;
import com.docker.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAO courseDao;
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(String courseID) {
		return courseDao.getById(courseID);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(String courseID) {
		Course entity = courseDao.getOne(courseID);
		courseDao.delete(entity);
	}

	@Override
	public Course updateCourse(Course course, String courseID) {

		courseDao.save(course);
		return course;
	}

}
