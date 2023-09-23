package java;
import java.util.*;

public class main {

    public static void main(String[] args) {
        

        Scanner V=new Scanner(System.in);
        System.out.println("enter the age");

        int age=V.nextInt();

        if(age<=18){
            System.out.println("Adult");

        }
        else{
       System.out.println("not adult");

        }
    }
    
}
