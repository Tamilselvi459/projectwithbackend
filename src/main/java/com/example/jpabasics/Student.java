package com.example.jpabasics;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_info")
public class Student {
    @Id
    private int studentId;
    @Column(name = " student_age")
    private int age;
    private int marks;
    private String name;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard librarycard;
}
