package OOP.Homework7.src.model;

import java.time.LocalDateTime;

public class SimpleNote implements Note {
    private String title;
    private String details;
    private LocalDateTime date;

    public SimpleNote(String title, String details, LocalDateTime date) {
        this.title = title;
        this.details = details;
        this.date = date;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String getDetails() {
        return details;
    }
}
