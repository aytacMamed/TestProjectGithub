public class Triangle extends Shape {
    public int a;
    public int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public void draw(){
        System.out.println((a*h)/2);
    }
}
