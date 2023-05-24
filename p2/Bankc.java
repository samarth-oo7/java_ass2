package p2;
abstract class Bank{
    abstract public void getbalance();
}
class Banka extends Bank{
    public void getbalance(){
        System.out.println("blace in bank A is 100$");
    }
}

class Bankb extends Bank{
    public void getbalance(){
        System.out.println("blace in bank B is 150$");
    }
}
class Bankc extends Bank{
    public void getbalance(){
        System.out.println("blace in bank C is 200$");
    }
    public static void main(String[] args) {
        Banka obja=new Banka();
        Bankb objb=new Bankb();
        Bankc objc=new Bankc();
        obja.getbalance();
        objb.getbalance();
        objc.getbalance();
    }
}


