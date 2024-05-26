class Pattern2 {
    public static void Solution(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = n; col >= 1; col--) {
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
 * * * * * rows =5 rows 1 2 3 4 5
 * * * * col=5 col 5 4 3 2 1
 * * *
 * *
 * 
 */
