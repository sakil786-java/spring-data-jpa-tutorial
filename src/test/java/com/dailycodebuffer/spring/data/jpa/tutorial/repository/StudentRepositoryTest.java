package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Gurdian;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;


@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;
	/*
	@Test
	public void saveStudent()
	{
		Student student=Student.builder()
				.emailId("shabbir@gmail.com")
				.firstName("Shabbir")
				.lastName("Dawoodi")
				//.gurdianName("Nikhil")
				//.gurdianEmail("nikhil@gmail.com")
				//.gurdianMobile("2345678901")
				.build();
		
		studentRepository.save(student);
	}
	
	@Test
	public void saveStudentWithGurdian()
	{
		Gurdian gurdian=Gurdian.builder()
				.email("sourav@gmail.com")
				.mobile("9674568914")
				.name("Sourav")
				.build();
		
		Student student=Student.builder()
				.emailId("shivam@gmail.com")
				.firstName("Shivam")
				.lastName("Kumar")
				.gurdian(gurdian)
				.build();
		
		studentRepository.save(student);
	}*/
	
	@Test
	public void printAllStudents()
	{
		List<Student> lisOfStudents=studentRepository.findAll();
		
		System.out.println("studentList= "+lisOfStudents);
		
	}
	
	@Test
	public void printFindByFirstName()
	{
		List<Student> lisOfStudents=studentRepository.findByFirstName("shivam");
		
		System.out.println("studentList ByFirstName= "+lisOfStudents);
		
	}
	
	@Test
	public void printFindByFirstNameContainCharacter()
	{
		List<Student> lisOfStudents=studentRepository.findByFirstNameContaining("sh");
		
		System.out.println("FirstNameContainCharacter List= "+lisOfStudents);
		
	}
	
	@Test
	public void printFindByGurdianName()
	{
		List<Student> lisOfStudents=studentRepository.findByGurdianName("Sourav");
		
		System.out.println("FindByGurdianName List= "+lisOfStudents);
		
	}
	@Test
	public void printStudentLastNameIsNotNull()
	{
		List<Student> lisOfStudents=studentRepository.findByLastNameNotNull();
		
		System.out.println("StudentLastNameIsNotNull List= "+lisOfStudents);
		
	} 
	
	@Test
	public void printStudentByEmail()
	{
		Student student=studentRepository.getStudentByEmailAddress("shabbir@gmail.com");
		System.out.println("Student_____ : "+student);
	}
	
	@Test
	public void printStudentFirstNameByEmail()
	{
		String firstName=studentRepository.getStudentFirstNameByEmailAddress("shabbir@gmail.com");
		System.out.println("Student FirstName : "+firstName);
	}
	
	@Test
	public void printStudentByEmailNative()
	{
		Student student=studentRepository.getStudentByEmailAddressNative("shabbir@gmail.com");
		System.out.println("Student by Native : "+student);
	}
	
	@Test
	public void printStudentByEmailNativeNamedParam()
	{
		Student student=studentRepository.getStudentByEmailAddressNativeNamedParam("shivam@gmail.com");
		System.out.println("Student by Native Named Param: "+student);
	}
	
	@Test
	public void updateStudentNameByEmail()
	{
		studentRepository.updateStudentNameByEmailId("Sheikh Shabbir","shabbir@gmail.com");
	
	}
}
