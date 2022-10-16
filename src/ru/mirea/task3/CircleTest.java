package ru.mirea.task3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println("Input radius: \n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        circle.setRadius(n);
        circle.diameterMethod();
        circle.circumferenceMethod();
        circle.areaOfCircleMethod();
        System.out.println(circle);
    }
}