import java.sql.SQLOutput;

public class cwh_String_method {
    public static void main(String[] args) {
        String name="Harry";

        //string methods
    1   System.out.println(name.length());

     2   System.out.println(name.toLowerCase());

     3   System.out.println(name.toUpperCase());

     4   System.out.println(name);

     5   System.out.println(name.trim());

     6   String rec="Harry";

     7   System.out.println(rec.substring(2));

     8   System.out.println(rec.substring(1,3));

     9   System.out.println(name.replace("r","p"));
        System.out.println(name.replace("rry","io"));

     10   System.out.println(name.startsWith("Har"));
        System.out.println(name.startsWith("par"));

     11   System.out.println(name.endsWith("Har"));
        System.out.println(name.endsWith("rry"));

     12   System.out.println(name.charAt(1));

     13   System.out.println(name.indexOf("a"));

        String modifiedname="harryrry";

     14   System.out.println(modifiedname.indexOf("rr",4));
     15    System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("r",4));

     16   System.out.println(name.equals("harry"));
        System.out.println(name.equals("Harry"));

     17   System.out.println(name.equalsIgnoreCase("Harry"));

       /*escape sequence characters
        System.out.println("I am escape sequence \n double line");
        System.out.println("I am escape sequence \t double line");
        System.out.println("I am escape sequence \' double line");
        System.out.println("I am escape sequence \" double line");
        System.out.println("I am escape sequence \\ double line");*/

        






    }
}
