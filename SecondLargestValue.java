// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class SecondLargestValue {

    public int secLarge(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr.length < 2) {
                return -1;
            }
            //swap the values and sort in acending orders
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
        // index of arr.lenght-2 will be the second largest values 
        return arr.length - 2;
    }

    public static void main(String[] args) {
        int arr[] = {10};
        SecondLargestValue second = new SecondLargestValue();
        int result = second.secLarge(arr);
        if (result == -1) {
            System.out.print("No second value found in array");
        } else {
            System.out.print("Second largest elements " + arr[result]);
        }
    }
}
