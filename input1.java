import java.util.*;
public class input1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();
        int numbers[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("enter the elements:");
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}