package com.chuyu.service.serviceimpl;

import com.chuyu.dao.StudentDao;
import com.chuyu.domain.Students;
import com.chuyu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl  implements StudentService {
    //注入dao
    @Autowired
    private StudentDao studentDao;


    //查询所有的学生信息
    public List<Students> findAll() throws Exception {
        return studentDao.findAll();
    }
    //保存学生信息

    public void save(Students students) {
        studentDao.save(students);
    }

    public void delete(Integer id) {
        studentDao.delete(id);
    }
    //查询单个信息

    public Students findOneById(Integer id) {
        return studentDao.findOneById(id);
    }
    //修改学生信息

    public void updata(Students student) {
        studentDao.updata(student);
    }
    //模糊查询学生信息

    public List<Students> finStudentByName(String sname) {
        return studentDao.finStuByName(sname);
    }
}
