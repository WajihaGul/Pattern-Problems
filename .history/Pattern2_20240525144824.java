class Pattern2 {
    public static void Solution(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int col = n; col <= n - rows; col--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution(5);
    }
}
/*
 * * * * *
 */
/*
 * 0 1 2 3 4
 * 0 * * * * * rows =5 rows 1 2 3 4 5
 * 1 * * * * col=5 col 5 4 3 2 1
 * 2 * * *
 * 3 * *
 * 4 *
 */
