package OOP.Seminar5.view.commands;

import OOP.Seminar5.view.ConsoleUi;

public class Finish extends Command {
    public Finish(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Закончить работу";
    }

    public void execute() {
        consoleUi.finish();
    }
}
