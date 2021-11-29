import java.util.Scanner;
public class prblm_ci {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        //principal * ((1 + rate/100) power time)
        System.out.println("enter the value of principal");
        float principal=src.nextFloat();
        System.out.println("enter the value of rate");
        float rate= src.nextFloat();
        System.out.println("enter the value of power time ");
        float power_time= src.nextInt();
        float C_I=principal*((1 + rate/100) *power_time);
        System.out.println(C_I);
    }
}

