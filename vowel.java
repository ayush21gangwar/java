import java.util.Scanner;
public class vowel {
    public static void main(String[] args){
        Scanner src= new Scanner(System.in);
        System.out.println("enter the character");
        char ch= src.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("vowels");
        }
          else{
            System.out.println("consonants");
    }

    }

}

