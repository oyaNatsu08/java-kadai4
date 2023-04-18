package kadai4;

public class ForPractice06 {
    public static void main(String[] args) {
        int rows = 10;
        for (var i = 1; i < 10; i++) {
            for (var j = 1; j <= 10; j++) {
                if ((i < 6) && (i >= j || j >= rows + 1 - i)) {
                    System.out.print("*");
                } else if ((i >= 6) && (i < j || j < rows + 1 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//        for (var i = 1; i < 5; i++) {
//            for (var j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //空白FOR
//            for (var y = 1; y <= 10 - (i * 2); y++) {
//                System.out.print(" ");
//            }
//            for (var j = 1; j <= i; j++) {
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}

/*
        for (var i = 1; i < 6; i++) {
            for (var j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (var k = 10; k < i; k - 2i) {
                System.out.println(" ");
            }
            for (var j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
*/
