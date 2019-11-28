interface Shape{
    abstract double getarea();
}

class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public String toString(){
    String ans = Double.toString(length * width);
    return ans;
    }
    public double getArea(){
    double ans = length * width;
    return ans;
    }
}

class Triangle implements Shape{
    double base;
    double height;
    public Rectangle(double base, double height){
        this.height = height;
        this.base = base;
    }
    public String toString(){
    String ans = Double.toString(height * base);
    return ans;
    }
    public double getArea(){
    double ans = height * base;
    return ans;
    }
}
