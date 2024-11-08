package OOP.Homework7.src.model;

import java.time.LocalDateTime;
import java.util.List;

public interface Notebook {
    void addNote(Note note);

    List<Note> getNotesForDay(LocalDateTime date);

    List<Note> getNotesForWeek(LocalDateTime startOfWeek);

    List<Note> getAllNotes();

    void saveToFile(String fileName);

    void loadFromFile(String fileName);

    void saveNotesToFile(String filename);

    void loadNotesFromFile(String filename);

    void showNotesForDay(LocalDateTime date);
}
