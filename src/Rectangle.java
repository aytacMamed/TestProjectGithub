public class Rectangle extends Shape{
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void draw(){
        System.out.println(a*b);
    }
}
