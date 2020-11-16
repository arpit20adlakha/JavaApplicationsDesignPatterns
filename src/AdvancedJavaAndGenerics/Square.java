package AdvancedJavaAndGenerics;

public class Square {
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }


    public int calculateArea() {
        return sideLength * sideLength;
    }

}
