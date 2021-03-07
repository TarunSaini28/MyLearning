package Classes;

import static java.lang.System.*;
class _ {
   final public static void test (String [] __A_V_) {
   String $ = "";

   for (int x=0; ++x < __A_V_.length; )
       $ += __A_V_[x];

   System.out.println($);
   
     String str = "11";
     boolean[] ba = new boolean[1];
     System.out.println("Checking ba" + ba[0]) ; 
     if (ba[0])
     str = "22";
     System.out.println("Checking str" + str) ; 
     
     
     String s1 = "ABC";
     String s2 = "ABC";
     String s3 = s2.concat("1");
     //s2 = s1 + s3; 
     s2.concat("Tarun");
     System.out.println(s2.concat("Tarun"));
     System.out.println(s2);
      s2 = "1";
      s3 = "1";
     System.out.println(s2 == s3);
     System.out.println("abcabc".replace('a', 'A')); // AbcAbc
     System.out.println("abcabc".replace("ab", "A")); // AbcAbc
     
     StringBuilder sb = new StringBuilder("animals");
     String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
     System.out.println(sb.equals("tarun"));
     System.out.println(sb);
     int len = sb.length();
     char ch = sb.charAt(6);
     System.out.println(sub + " " + len + " " + ch);
     }
   void walk1(){}
   int walk(){ return 1;}
   
}

