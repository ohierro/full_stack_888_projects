package com.hiberus;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4,4);
        System.out.println(square + " - perimetro: " +
                square.getPerimeter() +
                ", area: "+ square.getArea());

        square.setHeight(6);
        System.out.println(square + " - perimetro: " +
                square.getPerimeter() +
                ", area: "+ square.getArea());

        square = new Square(5, -5, 10, 10);
        System.out.println(square + " - perimetro: " +
                square.getPerimeter() +
                ", area: "+ square.getArea());
    }
}
