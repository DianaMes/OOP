package OOP.Homework6.src.service;

import java.io.*;
// import java.io.File;
import java.io.IOException;
import OOP.Homework6.src.model.Person;

public class FileOperations {
    public void savePersonToFile(Person person, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(person.getName() + "," + person.getBirthYear());
        }
    }

    public Person readPersonFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            String[] data = line.split(",");
            return new Person(data[0], Integer.parseInt(data[1]));
        }
    }
}