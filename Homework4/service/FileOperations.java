package OOP.Homework4.service;

public interface FileOperations<T> {
    void saveToFile(String filename, Iterable<T> items);

    Iterable<T> loadFromFile(String filename);
}
