import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        
       
        switch(a%2==0?1:0){
            case 0:
                System.out.println(a+"is odd");
                break;
            case 1:
                System.out.println(a+"is even");
                break;
           
        }
            
        }
    }
