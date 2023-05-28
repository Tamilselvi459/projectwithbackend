package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepository;
    @Autowired LibrarycardRepository librarycardRepository;

    public void addstudent(Student student , Department department) {

        LibraryCard card = new LibraryCard();
        card.setDepartment(department);
        card.setStudent(student);

        studentrepository.save(student);
        librarycardRepository.save(card);

    }

    public Student getstudentbyId(int id) {

      return  studentrepository.findById(id).get();
    }

    public List<String> getAllStudent() {
      List<Student> ans =   studentrepository.findAll();
      List<String> res = new ArrayList<>();
      for(Student st : ans) res.add(st.getName());
      return res;

    }

    public List<String> getstudentbyAge(int age) {
        List<Student> ans = studentrepository.findByAge(age);
        List<String> res = new ArrayList<>();
        for(Student st : ans) res.add(st.getName());
        return res;
    }

    public void deletebyid(int id) {
        studentrepository.deleteById(id);
    }

    public void deleteAllstudent() {
        studentrepository.deleteAll();
    }

    public List<String> getstudentageandmark(int age, int marks) {
        List<Student> ans = studentrepository. findByAgeAndMarks(age,marks);
        List<String> res = new ArrayList<>();
        for(Student st : ans) res.add(st.getName());
        return res;
    }

    public List<String> findAgeGreaterAge(int age) {

        List<Student> ans = studentrepository.findAgeGreaterAge(age);
        List<String> res = new ArrayList<>();
        for(Student st : ans) res.add(st.getName());
        return res;
    }
}
