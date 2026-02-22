/**
 * UC5PrintBanner Banner Display Application
 * This class extends UC4 by using Inline Array Initialization to 
 * define and populate the banner lines in a single concise statement.
 * * @author Developer
 * @version 5.0
 */
public class UC5PrintBanner {
    public static void main(String[] args) {
        // Step 1: Inline Initialization - Combining declaration and population
        String[] bannerLines = {
            String.join("", " **** ", " ", " **** ", " ", " ***** ", " ", " **** "),
            String.join("", "** **", " ", "** **", " ", "** **", " ", "** "),
            String.join("", "** **", " ", "** **", " ", "** **", " ", " **** "),
            String.join("", "** **", " ", "** **", " ", "***** ", " ", "    **"),
            String.join("", "** **", " ", "** **", " ", "** ", " ", "    **"),
            String.join("", "** **", " ", "** **", " ", "** ", " ", "** **"),
            String.join("", " **** ", " ", " **** ", " ", "** ", " ", " **** ")
        };

        // Step 2: Use a for-each loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}