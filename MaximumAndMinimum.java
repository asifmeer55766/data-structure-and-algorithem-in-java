
public class MaximumAndMinimum {

    public void CheckValues(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum is : " + max);
        System.out.println("minimum is : " + min);
    }

    public static void main(String[] args) {
        int arr[] = {112, 0, 6, 2, 1};
        MaximumAndMinimum max = new MaximumAndMinimum();
        max.CheckValues(arr);

    }
}
