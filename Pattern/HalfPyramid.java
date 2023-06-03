package Pattern;

public class HalfPyramid {
    public static void main(String[] args) {
        patt2(4);
    }

    public static void patt1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patt2(int n) {
        char val = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (val + j));
            }
            val = (char) (val + i + 1);
            System.out.println();
        }
    }
    
}
