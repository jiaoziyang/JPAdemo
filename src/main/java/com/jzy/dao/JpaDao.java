package com.jzy.dao;

import com.jzy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaDao extends JpaRepository<Student, Integer> {
}
