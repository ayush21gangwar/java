import java.util.Scanner;
public class functions_sum {
    public static int sumoftwonumbers(int a,int b){
        int sum;
        sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c;
        sumoftwonumbers(a,b);
        c=a+b;
        System.out.println(c);
    }
}

