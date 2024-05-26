class Pattern5 {
    public static void Solution(int n) {
        for (int rows = 1; rows < n; rows++) {
            for (int cols = 1; cols < n; cols++) {
                if (rows == 1 || rows == n || cols == 1 || cols == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution(5);
    }
}

/*
 * 1 2 3 4 5
 * r=> 1 * * * * * 5
 * 2 * * 2
 * 3 * * 2
 * 4 * * 2
 * 5 * * * * * 5
 */