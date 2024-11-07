package OOP.Seminar5.view.commands;

import OOP.Seminar5.view.ConsoleUi;

public class GetStudentsInfo extends Command {
    public GetStudentsInfo(ConsoleUi consoleUi) {
        super(consoleUi);
        description = "Получить список студентов";
    }

    public void execute() {
        consoleUi.printStudentGroup();
    }
}
