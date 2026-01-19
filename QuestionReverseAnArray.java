
public class QuestionReverseAnArray {

    public void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array");
        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 5, 6, 7, 8, 9};
        QuestionReverseAnArray ques = new QuestionReverseAnArray();
        ques.reverseArray(arr, 0, arr.length - 1);
    }
}
