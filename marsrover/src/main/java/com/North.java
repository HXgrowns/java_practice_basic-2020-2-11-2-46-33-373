package com;

public class North extends Direction {
    public North() {
        this.direction = 'N';
    }

    @Override
    public Direction turnRight() {
        return new East();
    }

    @Override
    public Direction turnLeft() {
        return new West();
    }
}
