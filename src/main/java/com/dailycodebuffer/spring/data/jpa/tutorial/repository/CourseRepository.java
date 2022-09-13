package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
