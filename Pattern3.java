// HALF PYRAMID
class Pattern3 {
    public static void Solution(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < rows + 1; cols++) {
                System.out.print(rows + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Solution(5);
    }
}

/*
 * / 0 1 2 3 4
 * 0 *
 * 1 * *
 * 2 * * *
 * 3 * * * *
 * 4 * * * * *
 */
/*
 * r c
 * 1 1
 * 1 r+1
 */
