import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a letter");
        char l=sc.next().charAt(0);
        if((l>='A')&& (l<='Z') || (l>='a')&&(l<='z'))
            System.out.println("it is an alphabet");
        
        else
            System.out.println("it is not an alphabet");
        
    }
}