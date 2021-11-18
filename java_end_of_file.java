
import java.util.*;

public class java_end_of_file {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a;
        int i=1;
       while(in.hasNext())
           {
           a=in.nextLine();
           System.out.println(i+" "+a);
           i++;
       }
    }
}
