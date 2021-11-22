import java.util.*;
public class pattern_twelve {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        char ch = 'a';
        int i = 1;
        int j=1;
        while(i<=n){

            while(j<=i){
                System.out.print("" +('a'+i-1));
                j=j+1;
                ch++;
            }
            System.out.println("  ");
            i=i+1;
        }


    }
}
