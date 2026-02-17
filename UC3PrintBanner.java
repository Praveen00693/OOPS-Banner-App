/**
 * UC3PrintBanner Banner Display Application
 * This class refactors the UC2 banner to use String.join() for 
 * improved memory efficiency and readability.
 * * @author Developer
 * @version 3.0
 */
public class UC3PrintBanner {
    public static void main(String[] args) {
        // Using String.join("", ...) to build each line efficiently
        // Alignment: 7 lines tall, 9 characters wide per letter
        
        System.out.println(String.join("", " **** ", " ", " **** ", " ", " ***** ", " ", " **** "));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** **", " ", "** "));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** **", " ", " **** "));
        System.out.println(String.join("", "** **", " ", "** **", " ", "***** ", " ", "    **"));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** ", " ", "    **"));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** ", " ", "** **"));
        System.out.println(String.join("", " **** ", " ", " **** ", " ", "** ", " ", " **** "));
    }
}