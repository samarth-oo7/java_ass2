package p2;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter ur maths marks:");
         int mat=sc.nextInt();
        System.out.println("enter ur physic marks:");
        int phy=sc.nextInt();
        System.out.println("enter ur biology marks:");
        int bio=sc.nextInt();

        int avg=(mat+phy+bio)/3;

        char grade='o';

        if(avg<=100 && avg<90){
            grade='A';
        }
     
        else  if(avg<= 90 && avg<80){
            grade='B';
        }
        else  if(avg<= 80 && avg<70){
            grade='c';
        }
        else  if(avg<= 80 && avg<70){
            grade='C';
        }
        else  if(avg<= 70 && avg<60){
            grade='D';
        }
        else {
            System.out.println("you are fail");
        }

        System.out.println("your grade :"+grade);
        sc.close();
       
    }
    
}
