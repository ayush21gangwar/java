
import java.util.*;
public class age_calculator {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int n=src.nextInt();
        int i=2;
        while(i<n){
            if (n%i==0){
                System.out.println("not prime");
                i=i+1;
            }
            else{
                System.out.println("prime");
                i=i+1;

            }

        }

    }
}
