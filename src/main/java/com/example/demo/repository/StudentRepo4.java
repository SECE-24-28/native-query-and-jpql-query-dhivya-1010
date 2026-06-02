package com.example.demo.repository;

import com.example.demo.model.Student4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepo4 extends JpaRepository<Student4,Integer> {
    List<Student4> findByGenderAndTech(String gender, String tech);
    List<Student4> findByTech(String tech);
}
