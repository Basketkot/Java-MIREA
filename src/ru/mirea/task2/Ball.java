package ru.mirea.task2;

class Ball {
    String color;
    int size;

    Ball(String xColor, int xSize) {
        color = xColor;
        size = xSize;
    }

    public String toString() {
        return "Ball: colour=" + color + ", size=" + size;
    }
}