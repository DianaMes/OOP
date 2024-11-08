package OOP.Homework6.src.util;

import OOP.Homework6.src.view.MessageView;
import OOP.Homework6.src.view.PersonView;
import OOP.Homework6.src.view.InputView;
import OOP.Homework6.src.model.Person;

import java.util.Scanner;

public class ConsoleTreeView implements MessageView, PersonView, InputView {

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName() + ", Birth Year: " + person.getBirthYear());
    }

    @Override
    public String getInput() {
        // Получаем ввод от пользователя
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter input: ");
            return scanner.nextLine();
        }
    }

    public void displayPersonDetails(Person person) {
        // Теперь getBirthYear() должен быть доступен
        int birthYear = person.getBirthYear();
        System.out.println("Year of birth: " + birthYear);
    }
}