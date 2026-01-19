
import java.util.Scanner;

public class Array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("Enter the values ");

        // getting the values 
        for (int i = 0; i <= num.length - 1; i++) {
            num[i] = sc.nextInt();
        }
        // printing the values 
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
