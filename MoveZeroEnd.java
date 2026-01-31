
public class MoveZeroEnd {

    public static void main(String[] args) {

        int zero = 0;
        int arr[] = {0, 1, 0, 4, 12};
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                if (arr[j] == zero && arr[j + 1] != zero) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+" , ");
            
        }
        System.out.print(arr.length+" , ");
    }
}
