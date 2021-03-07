package Learning;

class commondigit {
    public static void main(String[] args) {
        commondigit commondigit = new commondigit();
        int i = 2544;
        int j = 7524;
        String num1 = Integer.toString(i);
        String num2 = Integer.toString(j);
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();

        for (int a = ch1.length - 1; a >= 0; a--) {
            for (int k = ch2.length - 1; k >= 0; k--) {
                if (ch1[a] == (ch2[k])) {
                    System.out.println("Digit matached" + ch2[k] + ch1[a]);
                }
            }
        }


        for (int a = ch1.length - 1; a >= 0; a--) {
            if (ch1[a] == (ch2[a])) {
                System.out.println("Digit of a number matached" + ch2[a] +
                                   ch1[a] + "place of digit is " + a);
            }
        }
        // ins("I am the boss");
    }


}
