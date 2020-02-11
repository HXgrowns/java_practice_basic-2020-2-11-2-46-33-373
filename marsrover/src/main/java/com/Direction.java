package com;

public abstract class Direction {
    public char direction;
    public abstract Direction turnRight();
    public abstract Direction turnLeft();
    public void print() {
        System.out.println(direction);
    }
}

