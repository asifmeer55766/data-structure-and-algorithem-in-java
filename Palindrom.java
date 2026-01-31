
public class Palindrom {

    public boolean checkPalindrom(String str) {
        char stringArr[] = str.toCharArray();
        int start = 0;
        int end = stringArr.length - 1;
        while (start < end) {
            if (stringArr[start] != stringArr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String args[]) {
        Palindrom pl = new Palindrom();

        boolean result = pl.checkPalindrom("mada");
        if (result != true) {
            System.out.println("not a Palindrom");
        } else {
            System.out.println("Palindrom");
        }
    }
}
