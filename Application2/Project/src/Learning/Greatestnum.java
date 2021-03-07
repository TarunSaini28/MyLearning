package Learning;

public class Greatestnum {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 1;
        System.out.println("comparing the number " + test(a, b, c));
        System.out.println("number are equal " + compare(a, b, c));
    }

    static boolean test(int a, int b, int c) {
        if (a > b && a > c) {

            System.out.println("a is the greatest number");
        } else {
            System.out.println("b is the greatest number");
            return true;
        }
        return false;
    }

    static boolean compare(int a, int b, int c) {
        if (a == b && a == c && c == b) {

            System.out.println("all numbers are equal");
            return true;
        }

        else {
            System.out.println("numbers are not equal");
            return false;
        }

    }
}
