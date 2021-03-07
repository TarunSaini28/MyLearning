package Learning;

import java.util.Scanner;

public class Inputnumbers {

    static String num2;

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {

            num2 = args[i];


        }
        System.out.println("Printing the input " + num2);
    }


}
