package Intermediate_A3_Simon;

public class Rectangular {

    int width;
    int height;

    public Rectangular(int width, int height) {

        this.width = width;
        this.height = height;

    }

    public int calcRectArea() {
        int area = width * height;
        return area;
    }
}
