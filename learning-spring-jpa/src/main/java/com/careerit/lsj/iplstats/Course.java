package com.careerit.lsj.iplstats;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private double fee;
        @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
        private List<Student> students= new ArrayList<>();

        public void addStudent(Student student){
                students.add(student);
                student.getCourses().add(this);
        }

        public void removeStudent(Student student){
                students.remove(student);
                student.getCourses().remove(this);
        }

        public void addStudents(List<Student> students){
                this.students.addAll(students);
                students.forEach(student -> student.getCourses().add(this));
        }

        public void removeStudents(List<Student> students){
                this.students.removeAll(students);
                students.forEach(student -> student.getCourses().remove(this));
        }

}
