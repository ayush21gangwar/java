import java.util.*;
public class operator {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int a= src.nextInt();
        int b= src.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~b);
        System.out.println(a^b);
    }
}

