package Learning;

public class sumprime {
    public static void main(String[] args) {
        sumprime sumprime = new sumprime();
        prime prm = new prime();
        int sum = ' ';
        for (int i = 0; i < 100; i++) {
            if (prm.prim(i) == true) {
                sum = sum + i;
            }
            System.out.println("Sum of prime numbers is" + sum);
        }
        sum = 0;
        int j = 0;
        int k = 0;
        boolean shouldContinue = true;
        while (shouldContinue == true) {


            if (prm.prim(j) == true) {
                System.out.println("inside");
                sum = sum + j;
                k = k + 1;
                if (k == 100)
                    shouldContinue = false;
            }
            System.out.println("updating j  " + j);
            j = j + 1;
        }
        System.out.println("Sum of first 100 prime numbers is" + sum);
    }

}
