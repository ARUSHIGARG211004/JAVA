//WAP to check if a given number exist in the array or not(LINEAR SEARCH).
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
        System.out.print("enter a number to be found:");
        int x=sc.nextInt();
        boolean exist=false;
        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                exist=true;
                break;
            }
        }
            
        if(exist){
            System.out.println("exist");
        }
        else{
            System.out.println("not exist");
        }
        
            
        }
           
        
       
    }



