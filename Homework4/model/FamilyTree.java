package OOP.Homework4.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Person> {
    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void sortByName() {
        Collections.sort(people, Comparator.comparing(Person::getName));
    }

    public void sortByBirthYear() {
        Collections.sort(people, Comparator.comparingInt(Person::getBirthYear));
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }
}
