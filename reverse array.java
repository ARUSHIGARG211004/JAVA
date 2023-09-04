//WAP to reverse an array.
import java.util.*;
public class Main{
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("enter the values");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
         }
        System.out.print("the created array is:");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("the reversed array is:");
        for(int i=size-1;i>=0;i--){
            System.out.print(numbers[i]+" ");
        }
       
    }
}