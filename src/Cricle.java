public class Cricle extends Shape{
    public int r;

    public Cricle(int r) {
        this.r = r;
    }

    public void draw(){
      double draw=  Math.PI*r*r;
        System.out.println(draw);
    }
}
