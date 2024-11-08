package OOP.Homework5.main;

import OOP.Homework4.model.FamilyTree;
import OOP.Homework4.model.Person;
import OOP.Homework5.presenter.TreePresenter;
import OOP.hw2.FileOperationsImpl;
import OOP.Homework5.view.ConsoleTreeView;

public class Main {
    public static void main(String[] args) {
        // Параметризация с типом Person
        FamilyTree<Person> familyTree = new FamilyTree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        // Параметризация с типом Person
        FileOperationsImpl<Person> fileOperations = new FileOperationsImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree, view, fileOperations);
        presenter.handleUserInput();
    }
}
