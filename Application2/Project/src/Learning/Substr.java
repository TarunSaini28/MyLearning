package Learning;

public class Substr {
    public static void main(String[] args) {

        String str1 = "My name is khan";
        System.out.println("First half of string is " +
                           str1.substring(0, str1.length() / 2));

        String str2 = "TA";
        if (str2.length() < 3) {
            str2 = str2 + '*';
            System.out.println("Adding stars" + str2);
        }
        System.out.println("Adding stars" + str2.charAt(0));


    }
}
