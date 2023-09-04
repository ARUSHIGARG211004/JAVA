//WAP to count all the negative numbers in an array.
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
        int count=0;
        for(int i=0;i<size;i++){
            
            if(numbers[i]<0){
                count=count+1;
                
            }
                    
        }
        System.out.println();
        System.out.println("the count of the negative numbers is:"+count);
    }
}