//write a java program to print the count of the digits of a number.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            int d=n%10;
            count=count+1;
            n=n/10;
        }
        System.out.print(count);
    }
}