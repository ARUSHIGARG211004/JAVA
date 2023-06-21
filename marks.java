import java.util.*;
public class marks{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 0 or 1");
        int n= sc.nextInt();

        if(n==1){
            System.out.println("enter marks:");
            int marks=sc.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            }
            else if(marks<=89 & marks>=60){
                System.out.println("This is also Good");
            }
            else if(marks<=59 & marks>=0){
                System.out.println("This is Good as well");
            }
        }

        }
    }
