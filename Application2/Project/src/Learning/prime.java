package Learning;

public class prime {
    public static void main(String[] args) {

    }

    public boolean prim(int num) {
        //  int num = 7;
        boolean flag = false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }

        }
        if (flag == true) {
            System.out.println("Number is not a prime number" + num);
            return false;
        } else
            System.out.println("Number is a prime number" + num);
        return true;

    }
}

