package OOP.sem3.students_group;

import OOP.sem3.student.comparators.CompareStudentByAge;
import OOP.sem3.student.comparators.CompareStudentByName;
import OOP.sem3.student.Student;
import OOP.sem3.students_group.iterators.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> list;

    public StudentGroup() {
        list = new ArrayList<>();
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(list);
        // return list.listIterator()
    }

    public void sortByName() {
        list.sort(new CompareStudentByName());
    }

    public void sortByAge() {
        list.sort(new CompareStudentByAge());
    }

}
