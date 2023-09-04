//WAP to find the second largest element in the array.
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
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("the array in ascending order is:");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println(numbers[size-2]);
            
        }
           
        
       
    }



