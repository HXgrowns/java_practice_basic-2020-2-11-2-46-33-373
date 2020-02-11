package com;

public class App {
    public static void main(String[] args) {
        Direction direction = new North();
        direction = direction.turnLeft();
        direction.print();
        direction = direction.turnRight();
        direction.print();
    }
}
