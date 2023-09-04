//WAP to find the second largest element in the array.
import java.util.*;
public class Main{
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int numbers[]=new int[length];
        System.out.print("enter the values");
        for(int i=0;i<length;i++){
            numbers[i]=sc.nextInt();
         }
        System.out.print("the created array is:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        int numbers2[]=new int[length];
        for(int i=0;i<length;i++){
            numbers2[i]=numbers[i];
        }
        System.out.println();  
        System.out.println("the copied array is:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers2[i]+" ");
        }
        
       
    }
}



