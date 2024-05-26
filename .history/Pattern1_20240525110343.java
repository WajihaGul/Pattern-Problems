class Pattern1 {
    public static int Solution(int n) {
        /*
         * int rows= n;
         * int col=n;
         */

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n; col++) {
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
