import java.util.Scanner;
public class leap_year {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("enter the year");
        int year= src.nextInt();
        if (year % 400==0 ){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}

