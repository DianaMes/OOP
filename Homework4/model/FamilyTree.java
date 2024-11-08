package OOP.Homework4.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FamilyTree<T extends Person> implements Serializable { // Ограничиваем T типом Person
    // private static final long serialVersionUID = 1L;
    private List<T> people; // Параметризуем список с типом T

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(T person) {
        this.people.add(person);
    }

    public List<T> getPeople() {
        return people;
    }

    // Метод для поиска человека по имени
    public T findPersonByName(String name) {
        for (T person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    // Метод для сортировки по имени
    public void sortByName() {
        people.sort(Comparator.comparing(Person::getName));
    }

    // Метод для сортировки по году рождения
    public void sortByBirthYear() {
        people.sort(Comparator.comparingInt(Person::getBirthYear));
    }
}
