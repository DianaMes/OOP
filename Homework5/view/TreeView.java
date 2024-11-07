package OOP.Homework5.view;

import OOP.Homework4.model.Person;
import java.util.List;

public interface TreeView {
    void displayMessage(String message);

    void displayPersons(List<Person> persons);

    String getUserInput();

    void setPresenter(TreePresenter presenter);
}
