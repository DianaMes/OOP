package OOP.Seminar5.view.commands;

import OOP.Seminar5.view.ConsoleUi;

public class SortByAge extends Command {
    public SortByAge(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Отсортировать список по возрасту";
    }

    public void execute() {
        consoleUi.SortByAge();
    }
}