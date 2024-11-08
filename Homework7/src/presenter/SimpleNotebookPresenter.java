package OOP.Homework7.src.presenter;

import java.time.LocalDateTime;

import OOP.Homework7.src.model.Notebook;
import OOP.Homework7.src.model.SimpleNote;
import OOP.Homework7.src.view.NotebookView;

public class SimpleNotebookPresenter implements NotebookPresenter {
    private final Notebook model;
    private final NotebookView view;

    public SimpleNotebookPresenter(Notebook model, NotebookView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void addNote(String title, String details, LocalDateTime date) {
        model.addNote(new SimpleNote(title, details, date));
        view.showMessage("Note added successfully!");
    }

    @Override
    public void showNotesForDay(LocalDateTime date) {
        view.showNotes(model.getNotesForDay(date));
    }

    @Override
    public void showNotesForWeek(LocalDateTime startOfWeek) {
        view.showNotes(model.getNotesForWeek(startOfWeek));
    }

    @Override
    public void loadNotesFromFile(String fileName) {
        model.loadFromFile(fileName);
        view.showMessage("Notes loaded successfully!");
    }

    @Override
    public void saveNotesToFile(String fileName) {
        model.saveToFile(fileName);
        view.showMessage("Notes saved successfully!");
    }
}
