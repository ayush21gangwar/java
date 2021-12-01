import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int factorial=1;
        Scanner src= new Scanner(System.in);
        int n= src.nextInt();
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
            //System.out.println(factorial);
        }
        System.out.println(factorial);

    }
}

