package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

	Course course;


	@GetMapping("{id}")
	public Course retrieveAllCourses(String id) {
		return course;
	}
	@PostMapping()
	public String insetCourse(@RequestBody Course course){
		this.course=course;
		return "inserted";
	}

	@DeleteMapping("{id}")
	public String delete(String id){
		this.course=null;
		return "OK del";
	}

	@PutMapping("{id}")
	public String update(@RequestBody Course course){
		this.course=course;
		return "OK del";
	}



}
