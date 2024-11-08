package OOP.Homework7.src.view;

import java.util.List;

import OOP.Homework7.src.model.Note;

public interface NotebookView {
    void showNotes(List<Note> notes);

    void showMessage(String message);
}
