package com;

public class East extends Direction {
    public East() {
        this.direction = 'E';
    }

    @Override
    public Direction turnRight() {
        return new South();
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }
}
