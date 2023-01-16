package com.nitish.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nitish.entity.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> list=Arrays.asList(new Course(145,"core java","This is java"),
//									new Course(148,"adv java","This is adv jav"));
	
	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145, "core java" ,"This is core java"));
		list.add(new Course(1452 , "adv Java","This is adv Java"));
		
	}

	@Override
	public List<Course> getCourses() {
	
		return list;
	}

	@Override
	public Course getCourse(Integer courseId) {
		Course c=null;
		for(Course course : list)
		{
			if(course.getId().equals(courseId))
			{
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course,Integer courseId) {
		
		
//		list.forEach(e->{
//			if(e.getId()==course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//			
//		});
//		
//		return course;
		
		Course set=null;
		for(int i=0;i<list.size();i++)
		{
			Course t = list.get(i);
			
			if(t.getId().equals(courseId))
			{
				set = list.set(i, course);
			}
			
		}
		
		return set;
	}

	@Override
	public void deleteCourse(Integer courseId) {
		
		 list.removeIf(t->t.getId().equals(courseId));
		
		 
	}

	

}
