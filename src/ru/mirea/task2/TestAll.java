package ru.mirea.task2;

public class TestAll {
    public static void main(String[] args) {
        Shape shapeObject = new Shape(12, 33);  // Класс Shape
        System.out.println(shapeObject.toString());
        Ball objectBall = new Ball("Yellow", 5);  // Класс Ball
        System.out.println(objectBall.toString());
        Book objectBook = new Book("Getting thinks done", "David Allen", 416);  // Класс Book
        System.out.println(objectBook.toString());
        Dog objectDog1 = new Dog("Bob", 3);  // Класс Dog
        Dog objectDog2 = new Dog("Carl", 5);
        Dog objectDog3 = new Dog("Rebecca", 7);
        System.out.println(objectDog1.toString());
        System.out.println("Dog: name=" + objectDog2.getName() + ", age=" + objectDog2.getAge());
        System.out.println("Dog: name=" + objectDog3.getName() + ", people_age=" + objectDog3.getPeopleAge());
    }
}
