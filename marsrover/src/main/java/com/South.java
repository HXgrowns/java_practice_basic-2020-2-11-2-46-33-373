package com;

public class South extends Direction {
    public South() {
        this.direction = 'S';
    }

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public Direction turnLeft() {
        return new East();
    }
}
