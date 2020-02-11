package com;

public class West extends Direction {
    public West() {
        this.direction = 'W';
    }

    @Override
    public Direction turnRight() {
        return new North();
    }

    @Override
    public Direction turnLeft() {
        return new South();
    }
}
