package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import static org.junit.jupiter.api.Assertions.*;


import java.security.PublicKey;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Teacher;


@SpringBootTest
class CourseRepositoryTest {
	
	@Autowired
	private CourseRepository courseRepo;
/*
	@Test
	public void printCourses()
	{
		List<Course> courseList=courseRepo.findAll();
		
		System.out.println("Courses: "+courseList);
		
	}
	
	@Test
	public void saveCourseWithTeacher()
	{
		Teacher teacher=Teacher.builder().firstName("Priyanka").lastName("Singh").build();
		
		Course course=Course.builder().title("Python").credit(6).teacher(teacher).build();
		courseRepo.save(course);
	}
//Pagination
	@Test
	public void findAllPagination()
	{
		Pageable firstpageWithThreeRecords=PageRequest.of(0, 3);
		Pageable secondpageWithTwoRecords=PageRequest.of(1, 2);
		
		List<Course> courses=courseRepo.findAll(firstpageWithThreeRecords).getContent();
		
		long totalElements=courseRepo.findAll(firstpageWithThreeRecords).getTotalElements();
		
		long totalPages=courseRepo.findAll(firstpageWithThreeRecords).getTotalPages();
		
		System.out.println("totalPages: "+totalPages);
		
		System.out.println("totalElements: "+totalElements);
		
		
		System.out.println("Courses: "+courses);
	}
	
	@Test
	public void findAllPaginationWithSorting()
	{
		Pageable sortByTitle=PageRequest.of(0, 2,Sort.by("title"));
		Pageable sortByCreditDesc=PageRequest.of(1, 2,Sort.by("credit").descending());
		
		List<Course> sortByTitlecourses=courseRepo.findAll(sortByTitle).getContent();
		
		List<Course>sortByCreditDescCourses=courseRepo.findAll(sortByCreditDesc).getContent();
		
		
		
		System.out.println("sortByTitlecourses: "+sortByTitlecourses);
		
		System.out.println("sortByCreditDescCourses: "+sortByCreditDescCourses);
		
		
	}
	*/
	@Test
	public void saveCourseWithStudentAndTeacher()
	{
		Teacher teacher=Teacher.builder().firstName("Lizze").lastName("Morgan").build();
		
		Student student=Student.builder().firstName("Abhishek").lastName("Singh").emailId("abhishek@gmail.com")
				.build();
		
		Course course=Course.builder().title("AI").credit(12).teacher(teacher)
								.build();
		course.addStudents(student);
		courseRepo.save(course);
	}
}
