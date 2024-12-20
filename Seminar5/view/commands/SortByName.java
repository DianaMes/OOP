package OOP.Seminar5.view.commands;

import OOP.Seminar5.view.ConsoleUi;

public class SortByName extends Command {
    public SortByName(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Отсортировать список по имени";
    }

    public void execute() {
        consoleUi.getSortByName();
    }
}
