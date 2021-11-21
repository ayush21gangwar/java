
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args)
    {
            Scanner src=new Scanner(System.in);
            int n=src.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int k = 1; k < i; k++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j<=n;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
        }

    }
}
