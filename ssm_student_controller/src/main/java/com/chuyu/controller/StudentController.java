package com.chuyu.controller;

import com.chuyu.domain.Students;
import com.chuyu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Controller
@RequestMapping("/student")
public class StudentController {
    //注入service
    @Autowired
    private StudentService studentService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Students> students = studentService.findAll();
        System.out.println(students);
        mv.addObject("students",students);
        mv.setViewName("Student-lists");
        return mv;
    }
    //保存学生信息
    @RequestMapping("/save")
    public String save(Students students){
        studentService.save(students);
        return "redirect:findAll.do";
    }
    //删除学生信息
    @RequestMapping("/delete.do")
    public String delete(Integer id){
        studentService.delete(id);
        return "redirect:findAll.do";
    }
    //查询单个学生信息
    @RequestMapping("/findOneById.do")
    public ModelAndView findOneById(Integer id){
        ModelAndView mv = new ModelAndView();
        Students s = studentService.findOneById(id);
        mv.addObject("student",s);
        mv.setViewName("Student-exit");
        return mv;
    }
    //修改学生信息
    @RequestMapping("/update.do")
    public String updata(Students student){
        studentService.updata(student);
        return "redirect:findAll.do";
    }
    //模糊查询学生信息
    @RequestMapping("/findStuByName.do")
    public ModelAndView findStuByNmae(String sname){
        ModelAndView mv = new ModelAndView();
        List<Students> lists = studentService.finStudentByName(sname);
        mv.setViewName("Student-listsbyname");
        mv.addObject("students",lists);
        return  mv;
    }
}
