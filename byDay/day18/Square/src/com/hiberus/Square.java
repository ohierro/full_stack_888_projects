package com.hiberus;

public class Square {
    private int width;
    private int height;

    public Square() {
    }

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Square(int x, int y, int x1, int y1) {
        width = Math.abs(x - x1);
        height = Math.abs(y - y1);
    }

    public int getPerimeter() {
        return width * 2 + height * 2;
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
