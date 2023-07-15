//LINEAR SEARCH..

import java.util.*;
public class linear {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();
        int numbers[]= new int[size];

        for(int i=0;i<size;i++){
            System.out.println("enter the element:");
            numbers[i]=sc.nextInt();
        }
        System.out.println("enter the value of x:");
        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                System.out.print("the index is:"+i);
            }
        }
    }

}