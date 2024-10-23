package OOP.hw3.main;

import OOP.hw3.model.Person;
import OOP.hw3.service.FamilyTree;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        // Добавляем людей в семейное дерево
        familyTree.addPerson(new Person("Alice", 1990));
        familyTree.addPerson(new Person("Bob", 1985));
        familyTree.addPerson(new Person("Charlie", 2000));

        // Сортировка по имени
        System.out.println("Сортировка по имени:");
        familyTree.sortByName();
        for (Person person : familyTree) {
            System.out.println(person);
        }

        // Сортировка по году рождения
        System.out.println("Сортировка по году рождения:");
        familyTree.sortByBirthYear();
        for (Person person : familyTree) {
            System.out.println(person);
        }
    }

}
