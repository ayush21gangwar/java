import java.util.*;
public class max_min_arr {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        int arr[]={45,65,78,99,12,34,56,98};
        Arrays.sort(arr);

        System.out.println("minimum" +arr[0]);
        System.out.println("maximum" +arr[arr.length-1]);
    }
}