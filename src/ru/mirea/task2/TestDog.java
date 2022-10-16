package ru.mirea.task2;

import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        System.out.println("Введите кол-во собак:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Dog[] object = new Dog[n];
        String name = "";
        int age = 0;
        for (int i = 0; i < n; i++) {
            name = s.next();
            age = s.nextInt();
            object[i] = new Dog(name, age);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(object[i]);
        }
    }
}