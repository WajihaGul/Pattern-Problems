class Pattern4 {
    public static void Solution(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}

/*
 * 1 2 3 4 5
 * 1 1
 * 2 1 2
 * 3 1 2 3
 * 4 1 2 3 4
 * 5 1 2 3 4 5
 */