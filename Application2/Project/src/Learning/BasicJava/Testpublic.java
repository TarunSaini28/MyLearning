package Learning.BasicJava;

import Learning.prime;


public class Testpublic {
    public static void main(String[] args) {

        prime prm = new prime();
        System.out.println("checking the public class " + prm.prim(5));

    }


    public int smallestnumber(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("Smallest number is " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest number is " + b);
        } else
            System.out.println("Smallest number is " + c);

        return Math.min(a, Math.min(b, c));
    }

    public void avg(int i, int j, int k) {
        System.out.println("Average is  " + (i + j + k) / 3);
    }

    public boolean odd(int n) {
        if (n % 2 == 0) {
            return false;
        }
        return true;
    }

    public Boolean middleval(String str) {
        int len = str.length();
        int index = len / 2;
        if (odd(len) == false) {

            System.out.println("First character is " + str.charAt(index));
            System.out.println("Second character is " + str.charAt(index + 1));
        } else {
            System.out.println("Middle character is " + str.charAt(index));
        }
        return true;
    }

    public void testor(int a, int b) {
        if (a > 0 || b > 0)
            System.out.println("Checking the usage of or " + (a + b));
        //return true;
    }
}
