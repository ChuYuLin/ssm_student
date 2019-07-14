package com.chuyu.service;

import com.chuyu.domain.Students;

import java.util.List;

 public interface StudentService {
    public List<Students> findAll() throws Exception;

     void save(Students students);

     void delete(Integer id);

     Students findOneById(Integer id);

  void updata(Students student);

  List<Students> finStudentByName(String sname);
 }
