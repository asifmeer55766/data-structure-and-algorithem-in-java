
import java.util.Scanner;

public class ArrayUsingFunction {

    public int values[] = new int[5];
    Scanner sc = new Scanner(System.in);

    public void getArrayValues() {
        System.out.println("Enter the values ");
        for (int i = 0; i <= values.length - 1; i++) {
            values[i] = sc.nextInt();
        }
    }

    public void printArrayValues() {
        for (int i = 0; i <= values.length - 1; i++) {
            System.out.print(values[i] + "");
        }
    }

    public static void main(String[] args) {
        ArrayUsingFunction arr = new ArrayUsingFunction();
        arr.getArrayValues();
        arr.printArrayValues();
    }
}
