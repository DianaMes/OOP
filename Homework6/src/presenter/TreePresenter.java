package OOP.Homework6.src.presenter;

import OOP.Homework6.src.view.MessageView;
import OOP.Homework6.src.view.PersonView;
import OOP.Homework6.src.view.InputView;
import OOP.Homework6.src.model.Person;

public class TreePresenter {
    private MessageView messageView;
    private PersonView personView;
    private InputView inputView;

    public TreePresenter(MessageView messageView, PersonView personView, InputView inputView) {
        this.messageView = messageView;
        this.personView = personView;
        this.inputView = inputView;
    }

    public void presentPersonInfo(Person person) {
        personView.displayPersonInfo(person);
    }

    public void showMessage(String message) {
        messageView.showMessage(message);
    }

    public void processUserInput() {
        String userInput = inputView.getInput();
        System.out.println("User input: " + userInput);

    }
}