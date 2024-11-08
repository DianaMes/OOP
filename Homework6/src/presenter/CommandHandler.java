package OOP.Homework6.src.presenter;

// import OOP.Homework6.src.view.MessageView;  
// import OOP.Homework6.src.view.PersonView;   
// import OOP.Homework6.src.view.InputView;    
import OOP.Homework6.src.model.Person;

public class CommandHandler {
    private TreePresenter presenter;

    public CommandHandler(TreePresenter presenter) {
        this.presenter = presenter;
    }

    public void handleCommand(String command, Person person) {
        if ("show".equalsIgnoreCase(command)) {
            presenter.presentPersonInfo(person);
        } else {
            presenter.showMessage("Unknown command: " + command);
        }
    }
}