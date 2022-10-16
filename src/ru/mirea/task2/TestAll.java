package ru.mirea.task2;

public class TestAll {
    public static void main(String[] args) {
        Shape shapeObject = new Shape(4, 13);  // Класс Shape
        System.out.println(shapeObject.toString());
        Ball objectBall = new Ball("Красный", 9);  // Класс Ball
        System.out.println(objectBall.toString());
        Book objectBook = new Book("Война миров Z", "Макс", 666);  // Класс Book
        System.out.println(objectBook.toString());
        Dog objectDog1 = new Dog("Фостер", 7);  // Класс Dog
        Dog objectDog2 = new Dog("Джексон", 5);
        Dog objectDog3 = new Dog("Молли", 3);
        System.out.println(objectDog1.toString());
        System.out.println("Dog: name=" + objectDog2.getName() + ", age=" + objectDog2.getAge());
        System.out.println("Dog: name=" + objectDog3.getName() + ", people_age=" + objectDog3.getPeopleAge());
    }
}