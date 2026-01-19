//Question : give an array of integers , return an array with even integers removed 
// arr = {1,2,3,4,5,6,7,8,9,10};
// output : {1,3,5,7,9}

public class QuestionArray {

    public void returnOddNumbers(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 7, 9, 10};
        QuestionArray ques = new QuestionArray();
        ques.returnOddNumbers(arr);
    }
}
