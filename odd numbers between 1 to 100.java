//write a java program to print all odd numbers between 1 to 100.
public class Main{
    public static void main(String[]args){
        int i=0;
        while(i<=100){
            if(i%2!=0){
                System.out.print(i+" ");
            
            }
            i++;
        }
    }
}