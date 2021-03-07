package Learning;

public class Smallest {

    public static void main(String[] args) {
        int[] in = { -1, 17, 0, 25, 3, 100 };
        boolean flag = false;
        try {
            int a = in[0];
            for (int i = 1; i < in.length; i++) {
                System.out.println("Second in the loop" + in[i]);
                if (a < in[i]) {

                } else {
                    a = in[i];
                }
                
            }
            System.out.println("Smallest number is " + a);
        } catch (Exception e) {
            System.out.println("Failed to dervie the smallest number" + e);
        }
    }
}
