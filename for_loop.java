package loop.company;
import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int n= src.nextInt();
        int sum=0;
        int i=1;
       for( i=1;i<=n;i++){
           // if( i%2==0){
                //System.out.println(sum+i);
           sum=sum+i;
       }
        System.out.println(sum);

        }
    }

