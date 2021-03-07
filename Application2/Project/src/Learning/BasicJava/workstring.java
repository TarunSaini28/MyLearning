package Learning.BasicJava;

public class workstring {
    public static void main(String[] args) {
        System.out.println("printing the values" + ins("Enter the value"));


    }

    static String ins(String lin) {
        String rebuild = "";
        int j = 0;
        System.out.println("Adding values in a string" + lin);
        System.out.println("Adding values in a string" + lin.length());
        if (lin.indexOf(" ") > -1) {
            System.out.println("Yes");
        } else {
            System.out.println("Noo");
        }

        //char[] ch = lin.toCharArray();
        for (int i = 0; i < lin.length(); i++) {
            if (lin.charAt(i) == 32) {
                System.out.println("Place of string gng null" + i);
                rebuild = rebuild + lin.charAt(i);
                j = j + 1;
                if (j > 1) {
                    System.out.println("rebulding" + rebuild + "tarun");
                }


            }
        }
        System.out.println("Finally build is " + rebuild);


        return lin;
    }
    
    
}

