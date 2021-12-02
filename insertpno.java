import java.util.Scanner;
public class insertpno {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner src=new Scanner(System.in);
        int n= src.nextInt();
        int i;
        for(i=1;i<n;i++){
            if (n%i==0 && n%n==1)
                System.out.println();
        }

    }
}

