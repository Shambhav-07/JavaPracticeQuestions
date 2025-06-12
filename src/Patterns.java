public class Patterns {
    public static void main(String[] args) {
//        solid_Rectangle();
//        right_Angled_Traingle();
//        inverted_Right_angled_traingled();
//        pyramid();
//        half_pyramid_with_number();
//        floyds_triangle();
//        fullPyramid();
//        invertedFullPyramid();
//        diamond(3);


    }
    public static void diamond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*   ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }


    public static void invertedFullPyramid(){
        int size = 4;
        for (int i = size; i >=0 ; i--) {
            for (int j = size-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void fullPyramid(){
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(){
        int counter =1;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void half_pyramid_with_number(){
        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println(

            );
        }
    }
    public  static void pyramid() {
        int n = 3;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void inverted_Right_angled_traingled(){
        for (int i = 4; i >0 ; i--) {
            for (int j = i-1; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void right_Angled_Traingle(){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void solid_Rectangle(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
