
public class FindKeyInArray {

    public int findKey(int arr[], int key) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 73, 7};
        int key = 2;
        FindKeyInArray find = new FindKeyInArray();
        int result = find.findKey(arr, key);
        if (result != -1) {

            System.out.println("key found " + result);
        } else {
            System.out.println("key not found ");

        }

    }
}
