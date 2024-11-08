package OOP.Homework7.src.view;

import java.util.List;

import OOP.Homework7.src.model.Note;

public class ConsoleNotebookView implements NotebookView {
    @Override
    public void showNotes(List<Note> notes) {
        if (notes.isEmpty()) {
            System.out.println("No notes found.");
        } else {
            for (Note note : notes) {
                System.out.println("Title: " + note.getTitle());
                System.out.println("Details: " + note.getDetails());
                System.out.println("Date: " + note.getDate());
                System.out.println("---------------------------");
            }
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
