import java.util.*;
public class function_sum {
    public static int multiplyTwoNum(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int mul=multiplyTwoNum(a,b);
        System.out.println(mul);

    }
}