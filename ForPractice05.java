package kadai4;

public class ForPractice05 {
    public static void main(String[] args) {
        // for5
        for (var i = 1; i < 5; i++) {
            for (var j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (var i = 5; i > 0; i--) {
            for (var j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//        int size = 5;
//        for (int i = -size + 1; i < size; i++) {
//        int distance = Math.abs(i);
//        for (int j = 0; j < size - distance; j++) {
//        System.out.print("*");
//        }
//        System.out.println();
//        }