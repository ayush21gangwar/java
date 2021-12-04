import java.util.*;
public class function_power {
    public static int power( ) {
        Scanner src= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=src.nextInt();
        System.out.println("enter the value of b");
        int b=src.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
             ans= ans*a;
        }
        return ans;

    }

    public static void main(String[] args) {


      // int ans=1;
        int answer= power( );
        System.out.println(answer);
         answer= power( );
        System.out.println(answer);
        answer= power( );
        System.out.println(answer);



    }
    }


