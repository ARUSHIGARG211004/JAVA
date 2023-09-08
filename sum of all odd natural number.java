//write a java program to print sum of all odd natural numbers from 1 to n.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
            sum=sum+i;
        }
        }
        System.out.print(sum+" ");
        
    }
}