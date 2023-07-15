//TAKE AN ARRAY OF NAMES AS INPUT FROM THE USER AND PRINT THEM ON THE SCREEN..

import java.util.*;
public class name1{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();
        String names[]=new String[size];

        for(int i=0;i<size;i++){
            System.out.println("enter the names:");
            names[i]=sc.next();
        }
        System.out.println("The Array formed is:");
        for(int i=0;i<size;i++){
            System.out.print(names[i]+" ");
        }
    }
}