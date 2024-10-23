package OOP.hw3.service;

import OOP.hw3.model.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class FamilyTree implements Iterable<Person> {
    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    // Добавление человека в семейное дерево
    public void addPerson(Person person) {
        people.add(person);
    }

    // Сортировка по имени
    public void sortByName() {
        Collections.sort(people, Comparator.comparing(Person::getName));
    }

    // Сортировка по году рождения
    public void sortByBirthYear() {
        Collections.sort(people, Comparator.comparingInt(Person::getBirthYear));
    }

    // Реализация интерфейса Iterable
    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }
}
