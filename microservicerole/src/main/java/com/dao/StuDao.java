package com.dao;

import com.poj.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuDao extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}
