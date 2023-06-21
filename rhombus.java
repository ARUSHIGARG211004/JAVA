import java.util.*;
public class rhombus{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

            }
        }
    }
