package p2;

abstract  class parent {
    abstract public void message();
    
} 
class subclass1 extends parent{
    public void message(){
        System.out.println(" this is first subclass");
    }
}
class Subclass extends parent{
    public void message(){
        System.out.println("this is second subclass");
    }
    public static void main(String[] args) {
        subclass1 obj= new subclass1();
        Subclass obj2=new Subclass();
        obj.message();
        obj2.message();
    }
}