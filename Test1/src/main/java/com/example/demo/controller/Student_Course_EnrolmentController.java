package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.dao.Student_Course_EnrolmentRepository;
import com.example.demo.entity.Student;
import com.example.demo.entity.Student_Course_Enrolment;

@RestController
@RequestMapping("/api")
public class Student_Course_EnrolmentController {
	public static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	Student_Course_EnrolmentRepository studentCourseEnrolmentRepository;
	
	
	
}
