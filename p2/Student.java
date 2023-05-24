package p2;
import java.util.Scanner;
abstract class Marks{
    abstract public void getmarks();
}

class StudentA extends Marks{
    Scanner sc=new Scanner(System.in);
    public void getmarks(){
        System.out.println("enter the marks of three subject:");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();

        int per=((sub1+sub2+sub3)/3)*100;
        System.out.println("percentage of student a:"+per);

    }
    

}

class Student extends Marks{
    Scanner var=new Scanner(System.in);
    public void getmarks(){
        System.out.println("enter the marks of four subject:");
        int subj1=var.nextInt();
        int subj2=var.nextInt();
        int subj3=var.nextInt();
        int subj4=var.nextInt();
        int per=((subj1+subj2+subj3+subj4)/4)*100;

        System.out.println("percentage of student b:"+per);

    }
    public static void main(String[] args) {
        Student obj2=new Student();
        StudentA obj1=new StudentA();
        obj1.getmarks();
        obj2.getmarks(); 
    }
}
