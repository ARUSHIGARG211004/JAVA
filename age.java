
//write a function that takes in age as input and returns if that person is eligible to vote or not. a person of age>18 is eligible to vote.
import java.util.*;
public class age {
    public static void printAge(int age){
        if(age>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int age=sc.nextInt();
        printAge(age);
    }
}