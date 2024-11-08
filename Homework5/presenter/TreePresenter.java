package OOP.Homework5.presenter;

import OOP.Homework4.model.FamilyTree;
import OOP.Homework4.model.Person;
import OOP.hw2.FileOperationsImpl;
import OOP.Homework5.view.ConsoleTreeView;

public class TreePresenter {
    private FamilyTree<Person> familyTree;
    private ConsoleTreeView view;
    private FileOperationsImpl<Person> fileOperations;

    // Конструктор с параметрами
    public TreePresenter(FamilyTree<Person> familyTree, ConsoleTreeView view,
            FileOperationsImpl<Person> fileOperations) {
        this.familyTree = familyTree;
        this.view = view;
        this.fileOperations = fileOperations;
    }

    // Пример метода для обработки пользовательского ввода
    public void handleUserInput() {
        // Ваш код для обработки ввода
        System.out.println("Handling user input...");
    }
}
