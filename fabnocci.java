import java.util.Scanner;
public class fabnocci {
    public static void main(String[] args ){
        System.out.println("Enter the number of values");
        Scanner src= new Scanner(System.in);
        int n= src.nextInt();
        int a=0,b=1,c=0,i;
        System.out.print(a+ " ,"+b);
        for (i=1;i<n-2;i++){
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;

        }
    }
}

