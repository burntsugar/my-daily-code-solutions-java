package com.rach.problem.three19;

public class Tile {

    private int x;
    private int y;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveUp() {
        if (y > 0) {
            this.y -= 1;
        }
    }

    public void moveDown() {
        if (y < 2) {
            this.y += 1;
        }
    }

    public void moveLeft() {
        if (x > 0) {
            this.x -= 1;
        }
    }

    public void moveRight() {
        if (x < 2) {
            this.x += 1;
        }
    }

    public int getTilePosition(int gridUpperBound) {
        if (y == 0) return (y + x) + 1;
        if (y == 1) return (gridUpperBound + (y + x)) + 1;
        if (y == 2) return ((gridUpperBound * 2) + (y + x)) + 1;
        return -1;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
