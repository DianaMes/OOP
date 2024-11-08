package OOP.Homework6.src.model;

public class Person {
    private String name;
    // private int age;
    private int birthYear;

    // Конструктор, геттеры и сеттеры
    public Person(String name, int birthYear) {
        this.name = name;
        // this.age = age;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public int getAge() {
    // return age;
    // }

    // public void setAge(int age) {
    // this.age = age;
    // }

    public int getBirthYear() { // Добавляем метод для получения года рождения
        return birthYear;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Birth Year: " + birthYear);
    }
}
