/**
 * UC5 - Render OOPS Banner using Inline Array Initialization with String.join() and enhanced for-loop
 * Updated commit to align file history
 */

public class UC5_BannerApp {
    public static void main(String[] args) {

        String[] lines = {
                "  ***    ***    *****   ***** ",
                " *   *  *   *   *    *  *     ",
                "*     **     *  *    *  *     ",
                "*     **     *  *****   ***** ",
                "*     **     *  *           * ",
                " *   *  *   *   *           * ",
                "  ***    ***    *       ***** "
        };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
