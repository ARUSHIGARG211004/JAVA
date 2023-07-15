//FIND THE MAXIMUM AND MINIMUM NUMBER IN AN ARRAY OF INTEGERS
import java.util.*;
public class minimum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:"+" ");
        int size=sc.nextInt();
        int numbers[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("enter the element:");
            numbers[i]=sc.nextInt();
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
        System.out.println("the array in ascending order is:");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("the maximum number is:"+numbers[size-1]);
        System.out.println("the minimum number is:"+numbers[0]);

    }

}