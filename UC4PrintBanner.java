/**
 * UC4PrintBanner Banner Display Application
 * This class improves UC3 by using a String array to store banner lines
 * and a for-each loop to print them, enhancing modularity.
 * * @author Developer
 * @version 4.0
 */
public class UC4PrintBanner {
    public static void main(String[] args) {
        // Step 1: Define a String array to store all seven lines of the banner
        String[] bannerLines = new String[7];

        // Step 2: Populate each index of the array using String.join()
        bannerLines[0] = String.join("", " **** ", " ", " **** ", " ", " ***** ", " ", " **** ");
        bannerLines[1] = String.join("", "** **", " ", "** **", " ", "** **", " ", "** ");
        bannerLines[2] = String.join("", "** **", " ", "** **", " ", "** **", " ", " **** ");
        bannerLines[3] = String.join("", "** **", " ", "** **", " ", "***** ", " ", "    **");
        bannerLines[4] = String.join("", "** **", " ", "** **", " ", "** ", " ", "    **");
        bannerLines[5] = String.join("", "** **", " ", "** **", " ", "** ", " ", "** **");
        bannerLines[6] = String.join("", " **** ", " ", " **** ", " ", "** ", " ", " **** ");

        // Step 3: Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}