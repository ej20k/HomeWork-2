package com.company;

public class Box {
    int height; //высота
    int length; // длина
    int width; // ширина

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void checkBox() {
        if (height == width & width == length) {
            System.out.println("у нас куб");
        } else if (height == 0 & length > 0 & width > 0) {
            System.out.println("у нас конверт");
        } else if (height > 0 & length > 0 & width > 0) {
            System.out.println("у нас коробка");
        } else {
            System.out.println("сторона не может быть отрицательной,такой фигуры нет");
        }
    }
}

