package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Teacher;
@SpringBootTest
class TeacherRepositoryTest {

	@Autowired
	TeacherRepository teacherRepo;
	
	@Test
	public void saveTeacher()
	{
		Course courseDBA=Course.builder().title("DBA").credit(6).build();
		Course courseOS=Course.builder().title("OS").credit(5).build();
		
		/*
		 * Teacher teacher=Teacher.builder()
		 
							.firstName("Qutub")
							.lastName("Khan")
							.courses(List.of(courseDBA,courseOS))
							.build();
					teacherRepo.save(teacher);		
			//related to Teacher class one to Many				*/
		
		
	}

}
