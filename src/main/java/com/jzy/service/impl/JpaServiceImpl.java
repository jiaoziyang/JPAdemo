package com.jzy.service.impl;

import com.jzy.dao.JpaDao;
import com.jzy.entity.Student;
import com.jzy.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaServiceImpl implements JpaService {

    @Autowired
    private JpaDao jpaDao;

    @Override
    public List<Student> getList() {
        return jpaDao.findAll();
    }

    @Override
    public void add(Student student) {
        jpaDao.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> byId = jpaDao.findById(id);
        return byId.get();
    }

    @Override
    public void delById(int id) {
        jpaDao.deleteById(id);
    }

    @Override
    public void delByids(int[] ids) {
        for (int id : ids) {
            jpaDao.deleteById(id);
        }
    }

    @Override
    public void update(Student student) {
        jpaDao.save(student);
    }
}
