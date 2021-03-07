package Learning;

public class resverseword {
    public static void main(String[] args) {
        resverseword resverseword = new resverseword();
        String name = "Tarun";
        String reversename = "";
        char[] ch = name.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println("Printing the reversed String " + ch[i]);
            reversename = reversename + ch[i];
        }
        System.out.println("Printing the reversed String " + reversename);
    }
}
