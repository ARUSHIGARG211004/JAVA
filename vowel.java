import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char ch=sc.next().charAt();
        switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("is a vowel");
            break;
        default:
        System.out.println("is a consonent");
            
        }
    }
}