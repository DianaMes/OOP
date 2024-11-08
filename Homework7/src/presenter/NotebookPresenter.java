package OOP.Homework7.src.presenter;

import java.time.LocalDateTime;

public interface NotebookPresenter {
    void addNote(String title, String details, LocalDateTime date);

    void showNotesForDay(LocalDateTime date);

    void showNotesForWeek(LocalDateTime startOfWeek);

    void loadNotesFromFile(String fileName);

    void saveNotesToFile(String fileName);
}
