// TAKE AN ARRAY OF NUMBERS AS INPUT AND CHECK IF IT IS AN ARRAY SORTED IN ASCENDING ORDER.

import java.util.*;
public class ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:" + " ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the element:");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]+" ");
        }
        boolean as=true;

        for(int i=0;i<size-1;i++){
            if(numbers[i]<numbers[i+1]) {
                as=false;
            }
          }
        if(as){
            System.out.println("it is in ascending order");
        }
        else{
            System.out.println("it is not in ascending order");
        }

    }
}
