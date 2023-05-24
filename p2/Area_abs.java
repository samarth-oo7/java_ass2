package p2;
 abstract class Shape{
    abstract public void Rectanglearea(int l,int b);
    abstract public void Square(int a);
    abstract public void Circle(int r);

 }
 class Area_abs extends Shape{
    public void Rectanglearea(int l,int b){
        int a1=l*b;
        System.out.println("area of rectangle is:"+a1);
    }
    public void Square(int a){
        int a2=a*a;
    System.out.println("area of square is:"+a2);

    }
    public void Circle(int r){
        double a3=Math.PI*r*r;
        System.out.println("area of circle :"+a3);

    }
    public static void main(String[] args) {
        Area_abs obj=new Area_abs();
        obj.Rectanglearea(6, 5);
        obj.Circle(4);
        obj.Square(7);
    }

 }
