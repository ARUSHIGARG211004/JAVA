import java.util.*;
public class pattern3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows:");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}