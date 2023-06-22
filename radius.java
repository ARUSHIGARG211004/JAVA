
//write a function that takes in the radius as input and returns the circumference of the circle.
import java.util.*;
public class radius {
    public static float printCircum(int r){
        float circum= 2*3.14F*r;
        return circum;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius:");
        int r=sc.nextInt();
        float circum= printCircum(r);
        System.out.println(circum);


    }

}