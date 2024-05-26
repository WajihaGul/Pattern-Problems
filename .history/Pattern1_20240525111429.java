class Pattern1 {
    public static void Solution(int n) {
        /*
         * int rows= n;
         * int col=n;
         */

        for (int rows = 1; rows <= n; rows++) {
            for (int col = n; col <= 1; col--) {
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
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
