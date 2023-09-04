// WAP TO SUM ALL THE EVEN ELEMENTS IN ARRAY.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("enter the values in each=");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
            }
        System.out.print("The created array is:");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.print("the even elements are:");
        for(int i=0;i<size;i++){
            if(numbers[i]%2==0){
                System.out.print(numbers[i]+" ");
            }
        }
        
    }
}