package OOP.Homework6.src;

import OOP.Homework6.src.util.ConsoleTreeView;
// import OOP.Homework6.src.view.MessageView;
// import OOP.Homework6.src.view.PersonView;
// import OOP.Homework6.src.view.InputView;
import OOP.Homework6.src.presenter.TreePresenter;
import OOP.Homework6.src.presenter.CommandHandler;
import OOP.Homework6.src.model.Person;
import OOP.Homework6.src.service.FileOperations;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Инжекция зависимостей
        ConsoleTreeView consoleTreeView = new ConsoleTreeView();
        TreePresenter treePresenter = new TreePresenter(consoleTreeView, consoleTreeView, consoleTreeView);
        CommandHandler commandHandler = new CommandHandler(treePresenter);

        // Создаем объект Person
        Person person = new Person("John Doe", 1990);

        // Обработка команды
        commandHandler.handleCommand("show", person);

        // Дополнительно можно сохранить и прочитать из файла
        FileOperations fileOperations = new FileOperations();
        try {
            fileOperations.savePersonToFile(person, "person.txt");
            Person loadedPerson = fileOperations.readPersonFromFile("person.txt");
            commandHandler.handleCommand("show", loadedPerson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
