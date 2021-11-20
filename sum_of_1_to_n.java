import java.util.*;
public class sum_of_1_to_n {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner src= new Scanner(System.in);
        int num = src.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum=sum+i;
            i=i+1;

        }
        System.out.print(" " +sum);
    }
}