package OOP.hw2;

import java.io.*;

// Интерфейс для операций с файлами
interface FileOperations<T> {
    void saveToFile(T object, String fileName) throws IOException;

    T loadFromFile(String fileName) throws IOException, ClassNotFoundException;
}

// Реализация интерфейса для операций с файлами
