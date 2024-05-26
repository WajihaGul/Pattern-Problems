/*INVERTED HALF PYRAMID(ROTATED BY 180 DEGREE)
____*
___**
__***
_****
*****
 */
class Pattern7 {
    public static void Solution(int n) {
        for (int rows = 0; rows < n; rows++) { // for rows
            for (int space = 1; space < n - rows; space++) {
                System.out.print(" ");// for space
            }
            for (int col = 0; col <= rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution(5);
    }
}
