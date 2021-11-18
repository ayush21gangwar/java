
import java.util.Scanner;
public class even_no {
    public static void main(String[] args){
        Scanner src= new Scanner(System.in);
        System.out.println("enter the number");
        float i = src.nextInt();
        if (i%2==0){
            System.out.println("it is a even  number");
        }
        else
            System.out.println("it is not a even number");
    }
}
