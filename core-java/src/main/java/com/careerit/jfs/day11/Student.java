package com.careerit.jfs.day11;

public class Student {

        private int rollno;
        private String name;
        private String email;
        private TShirtSize size;

        public Student(int rollno, String name, String email, TShirtSize size) {
            this.rollno = rollno;
            this.name = name;
            this.email = email;
            this.size = size;
        }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", size=" + size +
                '}';
    }
}
