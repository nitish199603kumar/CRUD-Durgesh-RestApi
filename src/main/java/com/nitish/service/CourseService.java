package com.nitish.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.nitish.entity.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(Integer courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course,Integer courseId);
	public void deleteCourse(Integer courseId);
}
