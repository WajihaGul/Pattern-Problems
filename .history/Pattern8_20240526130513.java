class Pattern8 {
    public static void Solution(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < rows + 1; cols++) {
                if ((rows + cols) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution(5);
    }
}
