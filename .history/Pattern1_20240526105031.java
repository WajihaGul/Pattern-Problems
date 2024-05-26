class Pattern1 {
    public static void Solution(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print("* ");
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
