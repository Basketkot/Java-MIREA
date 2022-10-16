package ru.mirea.task2;

class Dog {
    String name;
    int age;

    Dog(String xName, int xAge) {
        name = xName;
        age = xAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPeopleAge() {
        return age * 7;
    }

    public String toString() {
        return "Dog: name=" + name + ", age=" + age;
    }
}