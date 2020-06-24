package com.jzy.service;

import com.jzy.entity.Student;

import java.util.List;

public interface JpaService {
    List<Student> getList();
    void add(Student student);
    Student getStudentById(int id);
    void delById(int id);
    void delByids(int[] ids);
    void update(Student student);
}
