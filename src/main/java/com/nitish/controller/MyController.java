package com.nitish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nitish.entity.Course;
import com.nitish.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService; 

	@GetMapping("/courses")
	public List<Course> getCources()
	{
		List<Course> courses = courseService.getCourses();
		return courses;
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable("courseId") String courseId)
	{
		return this.courseService.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		
		Course addCourse = courseService.addCourse(course);
		return addCourse;
	}
	
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@RequestBody Course course,@PathVariable("courseId") Integer courseId)
	{
		return courseService.updateCourse(course,courseId);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="course/{courseId}")
	public void deleteCourse(@PathVariable("courseId") Integer courseId)
	{
		 courseService.deleteCourse(courseId);
	}
	
	
	
	
	
	
	
	
}
