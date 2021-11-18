
import java.util.Scanner;
public class armstrong {
    public static void main(String [] args){
        Scanner src = new Scanner(System.in);
        int a= src.nextInt();
        int rem, sum = 0;
        int temp = a;
        while(temp > 0)
        {
            rem = temp % 10;
            sum = sum + (rem*rem*rem);
            temp = temp/ 10;
        }
        if(sum == a)
        {
            System.out.println( "armstrong");

        }
        else
        {
            System.out.println("not armstrong");

        }
    }
}
