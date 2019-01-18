public class Ex_1 {
    public static void main(String[] args) {
        int a = 13;
        int b = 6;
        int c = 4;
        int m = 123;
        int ticket = 1000;
        int returnSum = 0;
        int day = 15;
        double sideSquare = 6;
        double radiusCircle = 12.3;
        double sideTriangle = 17.3;
        double hideTriangle = 7.2;

        String as = "123";
        as = as.concat("456");
        System.out.println(as);

        System.out.println(Task1_1(a, b, c));
        System.out.println(Task2_2(m));

        double SquarePer = Task1_2.SquarePer(sideSquare); // Задание 1.2
        System.out.println(SquarePer);
        double SquareS = Task1_2.SquareS(sideSquare);
        System.out.println(SquareS);
        double CircleS = Task1_2.СircleS(radiusCircle);
        System.out.println(CircleS);
        double CirclePer = Task1_2.CirclePer(radiusCircle);
        System.out.println(CirclePer);
        double TrianglePer = Task1_2.TrianglePer(sideTriangle);
        System.out.println(TrianglePer);
        double TriangleS = Task1_2.TriangleS(sideTriangle, hideTriangle);
        System.out.println(TriangleS);

    }

    public static int Task1_1(int a, int b, int c) {
        int result;
        if (a % 2 == 0) {
            result = a * b / c;
        } else if (a + c % 2 == 0 || b + c % 2 == 0) {
            result = (int) Math.pow(a, c);
        } else {
            result = (a + b - c);
        }
        return result;
    }



    public static String Task2_2(int m) {
        String str = Integer.toString(m);
        return new StringBuilder(str).reverse().toString();
    }

    private static class Task1_2 {

        public static double SquarePer(double sideSquare) {
            return sideSquare * 4;
        }

        public static double SquareS(double sideSquare) {
            return Math.pow(sideSquare, 2);    // return sideSquare * sideSquare
        }

        public static double СircleS(double radius) {
            return Math.pow(radius, 2) * Math.PI;

        }

        public static double CirclePer(double radius){
            return 2 * Math.PI * radius;
        }

        public static double TrianglePer(double sideTriangle){
            return sideTriangle * 3;
        }

        public  static double TriangleS (double sideTriangle,double hideTriangle){
            return sideTriangle * hideTriangle / 2;
        }

    }


}

