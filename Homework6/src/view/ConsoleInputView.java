package OOP.Homework6.src.view;

import java.util.Scanner;

public class ConsoleInputView implements InputView {
    private Scanner scanner;

    public ConsoleInputView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        System.out.print("Enter input: ");
        return scanner.nextLine();
    }
}
