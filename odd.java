import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(2*i+1);
        }
    }
}
