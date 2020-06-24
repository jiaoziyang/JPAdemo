package com.jzy.controller;

import com.jzy.entity.Student;
import com.jzy.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @RequestMapping("/")
    public String test() {
        return "12312312312313123";
    }

    @GetMapping("/list")
    public List<Student> getList() {
        return jpaService.getList();
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        try {
            jpaService.add(student);
            return "成功";
        } catch (Exception e) {
            return "失败"+e;
        }
    }

    @GetMapping("/getById/{id}")
    public Object getById(@PathVariable("id") int id) {
        try {
            return jpaService.getStudentById(id);
        } catch (Exception e) {
            return "失败"+e;
        }
    }

    @DeleteMapping("/delById/{id}")
    public String delById(@PathVariable("id") int id) {
        try {
            jpaService.delById(id);
            return "成功";
        } catch (Exception e) {
            return "失败"+e;
        }
    }

    @DeleteMapping("/delByids")
    public String delByids(@RequestBody int[] ids) {
        try {
            jpaService.delByids(ids);
            return "成功";
        } catch (Exception e) {
            return "失败"+e;
        }
    }

    @PutMapping("/update")
    public String update(@RequestBody Student student) {
        try {
            jpaService.update(student);
            return "成功";
        } catch (Exception e) {
            return "失败"+e;
        }
    }

}
