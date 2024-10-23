package OOP.Seminar4.students_group;

import OOP.Seminar4.student.comparators.CompareStudentByAge;
import OOP.Seminar4.student.comparators.CompareStudentByName;
import OOP.Seminar4.students_group.iterators.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends StudyElement> implements Iterable<T> {
    private List<T> list;

    public StudentGroup() {
        list = new ArrayList<>();
    }

    public void addStudent(T student) {
        list.add(student);
    }

    @Override
    public Iterator<T> iterator() {
        return new StudentGroupIterator<>(list);
        // return list.listIterator()
    }

    public void sortByName() {
        list.sort(new CompareStudentByName<>());
    }

    public void sortByAge() {
        list.sort(new CompareStudentByAge<>());
    }

}
