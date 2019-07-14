package com.chuyu.dao;

import com.chuyu.domain.Students;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentDao {
    //查询所有的学信息
    @Select("select * from students")
    public List<Students> findAll() throws Exception;

    @Insert("insert into students(name,age,birthday,address) values(#{name},#{age},#{birthday},#{address})")
    void save(Students students);

    @Delete("delete from students where id=#{id}")
    void delete(Integer id);

    @Select("select id,name,age,birthday,address from students where id =#{id}")
    Students findOneById(Integer id);

    @Update("update students set name=#{name},age=#{age},birthday=#{birthday},address=#{address} where id=#{id}")
    void updata(Students student);

    @Select("select * from students where name like concat('%',#{sname},'%')")
    List<Students> finStuByName(String sname);
}
