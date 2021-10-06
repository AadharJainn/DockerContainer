package com.docker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.entity.Course;


public interface CourseDAO extends JpaRepository<Course, String> {

}
