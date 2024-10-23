package OOP.sem3.student.comparators;

import OOP.sem3.student.Student;

import java.util.Comparator;

public class CompareStudentByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // return o2.getAge() - o1.getAge();
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}