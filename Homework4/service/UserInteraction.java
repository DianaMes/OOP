package OOP.Homework4.service;

import OOP.Homework4.model.FamilyTree;
import OOP.Homework4.model.Person;

import java.util.Scanner;

public class UserInteraction {
    private FamilyTree<Person> familyTree; // Указываем тип Person
    private Scanner scanner;

    public UserInteraction() {
        familyTree = new FamilyTree<>(); // Создаем объект FamilyTree с типом Person
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. Sort by Name");
            System.out.println("3. Sort by Birth Year");
            System.out.println("4. Show Family Tree");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    familyTree.sortByName();
                    break;
                case 3:
                    familyTree.sortByBirthYear();
                    break;
                case 4:
                    showFamilyTree();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addPerson() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        familyTree.addPerson(new Person(name, birthYear));
    }

    private void showFamilyTree() {
        // Приводим T к Person, используя getPeople(), который возвращает List<Person>
        for (Person person : familyTree.getPeople()) {
            System.out.println(person.getName() + ", born in " + person.getBirthYear());
        }
    }
}
