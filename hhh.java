

import java.util.Scanner;
public class hhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        char ch;
        while(i < s.length())
        {
            ch = s.charAt(i);
            if(ch != ' ')
            {
                System.out.print(ch + "");
                i++;
            }
            else {
                System.out.println("");
                i++;
            }
        }

    }
}

