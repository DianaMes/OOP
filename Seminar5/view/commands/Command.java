package OOP.Seminar5.view.commands;

import OOP.Seminar5.view.ConsoleUi;

public abstract class Command {
    String description;
    ConsoleUi consoleUi;

    public Command(ConsoleUi consoleUi) {
        this.consoleUi = consoleUi;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
