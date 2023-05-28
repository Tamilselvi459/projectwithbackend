package com.example.jpabasics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer> {
    List<Student> findByAge(int age);

    List<Student> findByAgeAndMarks(int age, int marks);

    @Query(value = "select * from student_info where student_age > :age" , nativeQuery = true)
    List<Student> findAgeGreaterAge(int age);
}
