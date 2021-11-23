import java.util.*;
public class scope_and_variables {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);
        if (true)
        {
            a = 5;
            System.out.println(a);
        }
        System.out.println(a);
    }
}

