package com.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Course;
import com.springrest.services.CourseService;

@RestController

public class MyController {
	@Autowired
	private CourseService courseService;

	// get the course details
	@GetMapping("/crs")
	public List<Course> getCourses() {
		return this.courseService.getCourses();

	}

	// get the course by id
	@GetMapping("crs/{courseId}")
	public Course getCourse(@PathVariable long courseId) {
		return courseService.getCourse(courseId);

	}

	// add the course
	@PostMapping("/crs")
	public Course addCourse(@RequestBody Course course) {
		System.out.println(course);
		return this.courseService.addCourse(course);

	}

	// update the course
	@PutMapping("/crs")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);

	}
	// delete the course by id

	@DeleteMapping("/crs/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

}
