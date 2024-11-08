package OOP.Homework7.src.model;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import OOP.Homework7.src.model.SimpleNotebook;

public class SimpleNotebook implements Notebook {
    private List<Note> notes = new ArrayList<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Override
    public void addNote(Note note) {
        notes.add(note);

    }

    @Override
    public List<Note> getNotesForDay(LocalDateTime date) {
        return notes.stream()
                .filter(note -> note.getDate().toLocalDate().equals(date.toLocalDate()))
                .sorted(Comparator.comparing(Note::getDate))
                .collect(Collectors.toList());
    }

    @Override
    public List<Note> getNotesForWeek(LocalDateTime startOfWeek) {
        LocalDateTime endOfWeek = startOfWeek.plusDays(7);
        return notes.stream()
                .filter(note -> !note.getDate().isBefore(startOfWeek) && note.getDate().isBefore(endOfWeek))
                .sorted(Comparator.comparing(Note::getDate))
                .collect(Collectors.toList());
    }

    @Override
    public List<Note> getAllNotes() {
        return new ArrayList<>(notes);
    }

    @Override
    public void saveNotesToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Note note : notes) {
                writer.write(note.getTitle() + ";" + note.getDetails() + ";" + note.getDate().format(formatter));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadNotesFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String title = parts[0];
                String details = parts[1];
                LocalDateTime date = LocalDateTime.parse(parts[2], formatter);
                addNote(new SimpleNote(title, details, date));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showNotesForDay(LocalDateTime date) {
        List<Note> notesForDay = getNotesForDay(date); // Метод getNotesForDay уже реализован
        if (notesForDay.isEmpty()) {
            System.out.println("Нет записей на указанный день.");
        } else {
            System.out.println("Записи на " + date.toLocalDate() + ":");
            for (Note note : notesForDay) {
                System.out
                        .println(note.getDate().format(formatter) + " - " + note.getTitle() + ": " + note.getDetails());
            }
        }
    }

    @Override
    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Note note : notes) {
                writer.write(note.getTitle() + ";" + note.getDetails() + ";" + note.getDate().format(formatter));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error while saving to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String title = parts[0];
                    String details = parts[1];
                    LocalDateTime date = LocalDateTime.parse(parts[2], formatter);
                    addNote(new SimpleNote(title, details, date));

                }
            }
        } catch (IOException e) {
            System.err.println("Error while loading from file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
