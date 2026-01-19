
import java.util.*;

// find the sum of n number of integers 
public class SumFirstNNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int value = sc.nextInt();
        int sum = value * (value + 1) / 2;// time complexity is contant time here 
        System.out.println("Result is " + sum);

        // and here is n times 
        int total = 0;
        for (int i = 0; i <= value; i++) {
            total = total + i;
        }
        System.out.println("sum of n numbers using loop is :" + total);

    }
}

// asymtotic notation 
/*it is a mathematical tools that helps up to determine the running time of an algorithm based of the 
input size , 
generally it have three notations 
1) best case (omega)
2) average case (theta)
3) worst case  (big O)





*/
