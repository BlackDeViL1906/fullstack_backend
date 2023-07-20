package com.fullstack.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.security.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
