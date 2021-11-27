import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("choose 1 for +");
        System.out.println("choose 2 for -");
        System.out.println("choose 3 for *");
        System.out.println("choose 4 for /");
        int op = src.nextInt();
        System.out.println("enter the first number");
        int num1= src.nextInt();
        System.out.println("enter the second  number");
        int num2=src.nextInt();
        switch(op)
        {
            case 1:
            {
                int sum=num1+num2;
                System.out.println(sum);
                break;
            }
            case 2: {
                int sub = num1 - num2;
                System.out.println(sub);
                break;
            }
            case 3:{
                int mul= num1*num2;
                System.out.println(mul);
                break;
            }
                case 4:{
                float div= (num1/num2);
                System.out.println(div);
                 break;
            }
            default:
                System.out.println("entered choice is wrong");

        }


    }
}

