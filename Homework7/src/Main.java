package OOP.Homework7.src;

import java.time.LocalDateTime;
import java.time.Month;

import OOP.Homework7.src.model.Notebook;
import OOP.Homework7.src.model.SimpleNotebook;
import OOP.Homework7.src.view.ConsoleNotebookView;
import OOP.Homework7.src.presenter.SimpleNotebookPresenter;
import OOP.Homework7.src.view.NotebookView;
import OOP.Homework7.src.presenter.NotebookPresenter;

public class Main {
    public static void main(String[] args) {
        Notebook model = new SimpleNotebook();
        NotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new SimpleNotebookPresenter(model, view);

        // Добавляем записи
        presenter.addNote("Doctor's appointment", "Dentist at 7 PM", LocalDateTime.of(2024, Month.NOVEMBER, 9, 19, 0));
        presenter.addNote("Meeting", "Team meeting at 3 PM", LocalDateTime.of(2024, Month.NOVEMBER, 9, 15, 0));

        // Показываем записи на день
        presenter.showNotesForDay(LocalDateTime.of(2024, Month.NOVEMBER, 9, 0, 0));

        // Сохраняем записи в файл
        presenter.saveNotesToFile("notes.txt");

        // Загружаем записи из файла
        presenter.loadNotesFromFile("notes.txt");

        // Показываем все записи
        presenter.showNotesForDay(LocalDateTime.of(2024, Month.NOVEMBER, 9, 0, 0));
    }
}
