class FloydsTriangle {
    public static void Solution(int n) {
        int count = 1;
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(count++);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Solution(5);
    }
}
/*
 * 1
 * 23
 * 456
 * 78910
 */