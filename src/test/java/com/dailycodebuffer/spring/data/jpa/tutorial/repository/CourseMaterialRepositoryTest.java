package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.contains;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {

	@Autowired
	private CourseMaterialRepository courseMaterialRepo;
	
	@Test
	public void SaveCourseMaterial()
	{
		Course course=Course.builder().title(".NET").credit(6).build();
		
		CourseMaterial courseMaterial=CourseMaterial.builder()
									  .url("www.c#net.com")
									  .course(course)
									  .build();
		
		courseMaterialRepo.save(courseMaterial);
	}

	@Test
	public void printAllCourses()
	{
		List<CourseMaterial> courseMaterials=courseMaterialRepo.findAll();
		
		System.out.println("courseMaterials: "+courseMaterials);
	}
}
