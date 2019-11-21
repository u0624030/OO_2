public class CTriangle extends CShape
{
    protected double a;
    protected double b;
    protected double c;
    
    public CTriangle(double a, double b, double c)
    {
    this.a = a;
    this.b = b;
    this.c = c;
    }
    
    public void show(){
    System.out.print("color="+color+", ");
    System.out.println("area="+0.5*a*b);
    }
    
    public static void main(String args[])
    {
    CShape triangle = new CTriangle(3,4,5);
    triangle.setColor("Red");
    triangle.show();
    }
}
