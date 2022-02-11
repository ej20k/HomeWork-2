package com.company;

public class Box {
    int height; //высота
    int length; // длина
    int width; // ширина

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
       System.out.println("Это у нас коробка с высотой " + height + " длиной " + length + " шириной " + width);
    }

    public Box(int length,int width){
        this.length = length;
        this.width = width;
       System.out.println("Это у нас конверт с длиной " + length + " и шириной " + width);
    }

    public Box(int length){
        this.length = length;
        System.out.println("Это у нас куб с сторонами равными " + length);
    }

}