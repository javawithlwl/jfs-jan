package com.careerit.lsj.iplstats;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
        @JoinTable(
                name = "student_course",
                joinColumns = @JoinColumn(name = "student_id"),
                inverseJoinColumns = @JoinColumn(name = "course_id")
        )
        private List<Course> courses = new ArrayList<>();

        public void addCourse(Course course){
                courses.add(course);
                course.getStudents().add(this);
        }

        public void removeCourse(Course course){
                courses.remove(course);
                course.getStudents().remove(this);
        }

        public void addCourses(List<Course> courses){
                this.courses.addAll(courses);
                courses.forEach(course -> course.getStudents().add(this));
        }

        public void removeCourses(List<Course> courses){
                this.courses.removeAll(courses);
                courses.forEach(course -> course.getStudents().remove(this));
        }
}
